package com.dev.beans;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FormatDate {
	public static String formatDateDtb(Date createdDate) {
		String DATE_FORMAT = "yyyy/MM/dd";
        SimpleDateFormat fd = new SimpleDateFormat(DATE_FORMAT);
		return fd.format(createdDate);
	}
}
