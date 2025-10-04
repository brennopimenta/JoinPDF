package com.example.JoinPDF.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@RestController
@RequestMapping("/pdf")
public class PdfMergeController {

    @PostMapping(value = "/merge", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<byte[]> mergePdfFiles(@RequestParam("files") MultipartFile[] files) throws IOException {
        if (files == null || files.length == 0) {
            return ResponseEntity.badRequest().body(null);
        }

        PDFMergerUtility merger = new PDFMergerUtility();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        merger.setDestinationStream(outputStream);

        for (MultipartFile file : files) {
            merger.addSource(file.getInputStream());
        }

        merger.mergeDocuments(null);

        byte[] mergedPdf = outputStream.toByteArray();

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=merged.pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(mergedPdf);
    }
}
