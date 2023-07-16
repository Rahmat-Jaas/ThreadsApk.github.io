package com.instagram.common.analytics.phoneid;

import X.AnonymousClass0e5;
import X.C07960cV;
import X.C11180jf;
import X.L6I;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.secure.content.PublicContentDelegate;

public class AsyncInstagramPhoneIdProvider extends L6I {

    public class Impl extends PublicContentDelegate {
        public C11180jf A00 = new C11180jf();

        public final int A0M(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        public final int A0N(Uri uri, String str, String[] strArr) {
            throw new UnsupportedOperationException();
        }

        public final Cursor A0Q(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            return this.A00.query(uri, strArr, str, strArr2, str2);
        }

        public final Uri A0R(Uri uri, ContentValues contentValues) {
            throw new UnsupportedOperationException();
        }

        public final String A0T(Uri uri) {
            throw new UnsupportedOperationException();
        }

        public Impl(L6I l6i) {
            super(l6i);
        }
    }

    public final void A09() {
        if (C07960cV.A05(AnonymousClass0e5.A00(36324432503120378L))) {
            super.A09();
        }
    }
}
