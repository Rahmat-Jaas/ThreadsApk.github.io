package com.instagram.common.task;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0hL;
import X.AnonymousClass0wJ;
import X.AnonymousClass1c2;
import X.AnonymousClass3L0;
import X.C10300i6;
import X.C11630kW;
import X.C18250wR;
import X.C31155GhB;
import X.C32072Ab;
import X.C32165H8c;
import X.C62683aW;
import X.C63633hx;
import X.C63813iO;
import X.C63873iU;
import X.C63883iV;
import X.C83914sC;
import X.FR1;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import ch.boye.httpclientandroidlib.HttpStatus;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class IDxLTaskShape11S0400000_1_I2 extends FR1 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxLTaskShape11S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj4;
    }

    public final void A02(Exception exc) {
        if (this.A04 != 0) {
            C62683aW.A02((C62683aW) this.A00);
            return;
        }
        AnonymousClass0LU.A03(AnonymousClass1c2.class, "Failed to load external media file.", exc);
        C18250wR.A1C(this.A03);
        C63813iO.A04(2131822720);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj) {
        if (this.A04 != 0) {
            List list = (List) obj;
            if (!list.isEmpty()) {
                Object obj2 = this.A00;
                C32165H8c A0E = C63883iV.A0E((C10300i6) this.A03, list);
                C63873iU.A0E(A0E, obj2, HttpStatus.SC_PROCESSING);
                C31155GhB.A03(A0E);
                return;
            }
            C62683aW.A02((C62683aW) this.A00);
            return;
        }
        AnonymousClass1c2 r1 = (AnonymousClass1c2) this.A00;
        ArrayList arrayList = r1.A07.A0B;
        arrayList.add(obj);
        AnonymousClass1c2.A02(r1, arrayList.size() - 1);
        C18250wR.A1C(this.A03);
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String type;
        InputStream openInputStream;
        C32072Ab r1;
        String str;
        int i = this.A04;
        Context context = (Context) this.A01;
        if (i != 0) {
            C10300i6 r3 = (C10300i6) this.A03;
            AnonymousClass0wJ.A1N(context, r3);
            return C63633hx.A01(context, (C11630kW) this.A02, r3, (C83914sC) null, "login");
        }
        Uri uri = (Uri) this.A02;
        if ("file".equals(uri.getScheme())) {
            String path = uri.getPath();
            if (path != null) {
                type = URLConnection.getFileNameMap().getContentTypeFor(path);
            } else {
                type = null;
            }
            openInputStream = new BufferedInputStream(new FileInputStream(path));
        } else {
            ContentResolver contentResolver = context.getContentResolver();
            type = contentResolver.getType(uri);
            openInputStream = contentResolver.openInputStream(uri);
        }
        if (type != null) {
            try {
                if (type.startsWith("video/")) {
                    str = "screenrecording";
                } else {
                    str = "screenshot";
                }
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
                if (extensionFromMimeType != null) {
                    extensionFromMimeType = AnonymousClass00U.A0L(".", extensionFromMimeType);
                }
                File A002 = AnonymousClass3L0.A00(context, str, extensionFromMimeType);
                if (AnonymousClass0hL.A09(A002, openInputStream)) {
                    String absolutePath = A002.getAbsolutePath();
                    if (openInputStream == null) {
                        return absolutePath;
                    }
                    openInputStream.close();
                    return absolutePath;
                }
                r1 = new C32072Ab("Could not copy external file to temporary file.");
            } catch (Throwable th) {
                if (openInputStream != null) {
                    openInputStream.close();
                }
                throw th;
            }
        } else {
            r1 = new C32072Ab("Could not determine MIME type of external file.");
        }
        throw r1;
    }

    public final int getRunnableId() {
        if (this.A04 != 0) {
            return 530;
        }
        return 254;
    }
}
