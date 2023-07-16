package com.facebook.browser.lite.bridge;

import X.AnonymousClass3RQ;
import X.C15430rJ;
import X.C16390sy;
import X.IF5;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.redex.IDxCreatorShape115S0000000_I2;

public class BrowserLiteJSBridgeProxy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape115S0000000_I2(8);
    public Bundle A00;
    public IF5 A01;
    public String A02;
    public final String A03;

    public final synchronized Bundle A03() {
        return this.A00;
    }

    public final synchronized IF5 A04() {
        return this.A01;
    }

    public final synchronized String A05() {
        return this.A02;
    }

    public final synchronized void A06(IF5 if5) {
        this.A01 = if5;
        if (if5 != null) {
            this.A02 = if5.A03();
        }
    }

    public final synchronized void A07(String str) {
        this.A02 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeBundle(this.A00);
    }

    public BrowserLiteJSBridgeProxy(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A00 = parcel.readBundle();
    }

    public static boolean A00(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, IF5 if5, String str) {
        Uri uri;
        if (!AnonymousClass3RQ.A00(str)) {
            return false;
        }
        Uri uri2 = null;
        if (if5.A03() != null) {
            uri = C15430rJ.A00(new C16390sy(), if5.A03(), true);
        } else {
            uri = null;
        }
        String A012 = browserLiteJSBridgeCall.A01();
        if (A012 != null) {
            uri2 = C15430rJ.A01(A012);
        }
        if (uri == null || uri.getAuthority() == null || uri2 == null || uri2.getAuthority() == null || !uri.getAuthority().equals(uri2.getAuthority())) {
            return false;
        }
        return true;
    }

    public final Context A02() {
        if (A04() != null) {
            return A04().A01();
        }
        return null;
    }

    public BrowserLiteJSBridgeProxy() {
        this.A03 = "_AutofillExtensions";
    }
}
