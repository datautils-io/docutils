package com.datautils.doc.pdf.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.springframework.stereotype.Service;

@Service
public class PdfConverterService {

	public byte[] convertHtmlToPdf(String htmlContent) throws IOException {
		try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
			return outputStream.toByteArray();
		}
	}

	public byte[] convertHtmlFileToPdf(String htmlFilePath) throws IOException {
		String htmlContent = new String(Files.readAllBytes(new File(htmlFilePath).toPath()));
		return convertHtmlToPdf(htmlContent);
	}
}
