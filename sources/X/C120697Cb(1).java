package X;

import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7Cb  reason: invalid class name and case insensitive filesystem */
public final class C120697Cb {
    public static final Pattern A00 = Pattern.compile("<rdf:li>\\d{10,}</rdf:li>");

    public static String A00(String str) {
        int indexOf;
        int indexOf2;
        if (AnonymousClass0hA.A08(str)) {
            return null;
        }
        int indexOf3 = str.indexOf("<Attrib:Ads>");
        if (indexOf3 > -1 && (indexOf2 = str.indexOf("</Attrib:Ads>")) > indexOf3) {
            return str.substring(indexOf3, indexOf2 + 13);
        }
        int indexOf4 = str.indexOf("<dc:creator>");
        if (indexOf4 <= -1 || (indexOf = str.indexOf("</dc:creator>")) <= indexOf4) {
            return null;
        }
        Matcher matcher = A00.matcher(str.substring(indexOf4, indexOf + 13));
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static void A01(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(C86144wL.A0Z(str), "r");
            LinkedList linkedList = new LinkedList();
            randomAccessFile.seek(0);
            for (C1194275h A002 = C1194275h.A00(randomAccessFile); A002 != null; A002 = C1194275h.A00(randomAccessFile)) {
                if (new String(A002.A01).equals("moov") || new String(A002.A01).equals("uuid")) {
                    linkedList.add(A002);
                }
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                randomAccessFile.seek(((C1194275h) it.next()).A00 + 8);
            }
        } catch (Exception unused) {
        }
    }
}
