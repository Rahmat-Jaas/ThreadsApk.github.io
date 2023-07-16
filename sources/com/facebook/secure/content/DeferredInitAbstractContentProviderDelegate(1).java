package com.facebook.secure.content;

import X.AnonymousClass00U;
import X.C13850oP;
import X.C15780rs;
import X.C16050sO;
import X.C16270sl;
import X.C17620vF;
import X.C41029Luq;
import X.L6I;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class DeferredInitAbstractContentProviderDelegate extends C41029Luq {
    public final AtomicBoolean A00 = new AtomicBoolean();

    public abstract int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr);

    public abstract int A0N(Uri uri, String str, String[] strArr);

    public abstract Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    public abstract Uri A0R(Uri uri, ContentValues contentValues);

    public abstract String A0T(Uri uri);

    public void A0U() {
    }

    public boolean A0Y() {
        return false;
    }

    public static void A00() {
        C13850oP.A00(512, 1463009525);
    }

    private void A01(String str) {
        if (Systrace.A0F(512)) {
            C13850oP.A01(512, AnonymousClass00U.A0V(getClass().getSimpleName(), ".", str), -1008808295);
        }
    }

    private void A02(String str) {
        String A01;
        C17620vF r3 = C16270sl.A00;
        if (!r3.A00.isEmpty()) {
            Context A03 = A03();
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s/%s", A03.getPackageName(), getClass().getName());
            C16050sO r1 = null;
            try {
                r1 = C15780rs.A00(A03, Binder.getCallingUid());
            } catch (SecurityException unused) {
            }
            String str2 = str;
            if (r1 != null) {
                String obj = r1.toString();
                if (r1.A01() == null) {
                    A01 = "null";
                } else {
                    A01 = r1.A01();
                }
                r3.A01(A03, formatStrLocaleSafe, str2, obj, A01);
                return;
            }
            r3.A00(A03, formatStrLocaleSafe, str);
        }
    }

    public final int A04(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A01("update");
        A02("update");
        try {
            A0W();
            return A0M(uri, contentValues, str, strArr);
        } finally {
            A00();
        }
    }

    public final int A05(Uri uri, String str, String[] strArr) {
        A01("delete");
        A02("delete");
        try {
            A0W();
            return A0N(uri, str, strArr);
        } finally {
            A00();
        }
    }

    public final int A06(Uri uri, ContentValues[] contentValuesArr) {
        A01("bulkInsert");
        A02("bulkInsert");
        try {
            A0W();
            return A0O(uri, contentValuesArr);
        } finally {
            A00();
        }
    }

    public final AssetFileDescriptor A07(Uri uri, String str) {
        A01("openAssetFile");
        A02("openAssetFile");
        try {
            if (str.contains("w")) {
                A0W();
            } else {
                A0X();
            }
            return A0P(uri, str);
        } finally {
            A00();
        }
    }

    public final AssetFileDescriptor A08(Uri uri, String str, Bundle bundle) {
        A01("openTypedAssetFile");
        A02("openTypedAssetFile");
        try {
            A0X();
            return null;
        } finally {
            A00();
        }
    }

    public final Cursor A09(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        A01("query");
        A02("query");
        try {
            A0X();
            return A0Q(uri, strArr, str, strArr2, str2);
        } finally {
            A00();
        }
    }

    public final Cursor A0A(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A01("query");
        A02("query");
        try {
            A0X();
            return A0Q(uri, strArr, str, strArr2, str2);
        } finally {
            A00();
        }
    }

    public final Uri A0B(Uri uri, ContentValues contentValues) {
        A01("insert");
        A02("insert");
        try {
            A0W();
            A0R(uri, contentValues);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } catch (Throwable th) {
            A00();
            throw th;
        }
    }

    public final Bundle A0C(String str, String str2, Bundle bundle) {
        A01("call");
        A02("call");
        try {
            A0W();
            return null;
        } finally {
            A00();
        }
    }

    public final ParcelFileDescriptor A0D(Uri uri, String str) {
        A01("openFile");
        A02("openFile");
        try {
            if (str.contains("w")) {
                A0W();
            } else {
                A0X();
            }
            return A0S(uri, str);
        } finally {
            A00();
        }
    }

    public final String A0E(Uri uri) {
        A01("getType");
        A02("getType");
        try {
            A0X();
            return A0T(uri);
        } finally {
            A00();
        }
    }

    public final void A0F() {
        A01("onLowMemory");
        try {
            if (this.A00.get()) {
                super.A0F();
            }
        } finally {
            A00();
        }
    }

    public final void A0G() {
        A01("shutdown");
        A00();
    }

    public final void A0H(int i) {
        A01("onTrimMemory");
        try {
            if (this.A00.get()) {
                super.A0H(i);
            }
        } finally {
            A00();
        }
    }

    public final void A0I(Configuration configuration) {
        A01("onConfigurationChanged");
        try {
            if (this.A00.get()) {
                super.A0I(configuration);
            }
        } finally {
            A00();
        }
    }

    public final boolean A0J() {
        A01("isTemporary");
        try {
            A0X();
            return A0Z();
        } finally {
            A00();
        }
    }

    public final ContentProviderResult[] A0K(ArrayList arrayList) {
        A01("applyBatch");
        A02("applyBatch");
        try {
            A0W();
            return A0a(arrayList);
        } finally {
            A00();
        }
    }

    public final String[] A0L(Uri uri, String str) {
        A01("getStreamTypes");
        A02("getStreamTypes");
        try {
            A0X();
            return null;
        } finally {
            A00();
        }
    }

    public final void A0V() {
        AtomicBoolean atomicBoolean = this.A00;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                A0U();
                atomicBoolean.set(true);
            }
        }
    }

    public DeferredInitAbstractContentProviderDelegate(L6I l6i) {
        super(l6i);
        A01("onCreate");
        A00();
    }

    public final int A0O(Uri uri, ContentValues[] contentValuesArr) {
        return super.A06(uri, contentValuesArr);
    }

    public final AssetFileDescriptor A0P(Uri uri, String str) {
        return super.A07(uri, str);
    }

    public final ParcelFileDescriptor A0S(Uri uri, String str) {
        return super.A0D(uri, str);
    }

    public final void A0W() {
        A0V();
        if (!A0Y()) {
            throw new SecurityException("Component access not allowed.");
        }
    }

    public final void A0X() {
        A0V();
        if (!A0Y()) {
            throw new SecurityException("Component access not allowed.");
        }
    }

    public final boolean A0Z() {
        return super.A0J();
    }

    public final ContentProviderResult[] A0a(ArrayList arrayList) {
        return super.A0K(arrayList);
    }
}
