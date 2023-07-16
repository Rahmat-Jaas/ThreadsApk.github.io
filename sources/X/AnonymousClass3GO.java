package X;

import android.net.Uri;
import java.util.Collection;

/* renamed from: X.3GO  reason: invalid class name */
public abstract class AnonymousClass3GO {
    public final boolean A00() {
        Collection collection;
        if (this instanceof AnonymousClass1QB) {
            return C18180wK.A1W(((AnonymousClass1QB) this).A00.length);
        }
        if (this instanceof AnonymousClass1QA) {
            collection = ((AnonymousClass1QA) this).A00;
        } else if (this instanceof AnonymousClass1Q8) {
            collection = ((AnonymousClass1Q8) this).A00;
        } else if (this instanceof AnonymousClass1Q7) {
            return C18180wK.A1W(((AnonymousClass1Q7) this).A00.length);
        } else {
            return false;
        }
        return collection.isEmpty();
    }

    public final boolean A01(Uri uri) {
        String host;
        if (this instanceof AnonymousClass1QB) {
            AnonymousClass1QB r0 = (AnonymousClass1QB) this;
            if (!(uri == null || (host = uri.getHost()) == null)) {
                for (String str : r0.A00) {
                    if (host.equals(str) || host.endsWith(AnonymousClass00U.A0L(".", str))) {
                        return true;
                    }
                }
            }
        } else if (this instanceof AnonymousClass1QA) {
            AnonymousClass1QA r02 = (AnonymousClass1QA) this;
            if (uri == null || !r02.A00.contains(uri.getPath())) {
                return false;
            }
            return true;
        } else if (this instanceof AnonymousClass1Q9) {
            return !((AnonymousClass1Q9) this).A00.A01(uri);
        } else {
            if (this instanceof AnonymousClass1Q8) {
                AnonymousClass1Q8 r03 = (AnonymousClass1Q8) this;
                if (uri != null) {
                    return r03.A00.contains(uri.getScheme());
                }
                return false;
            }
            AnonymousClass1Q7 r04 = (AnonymousClass1Q7) this;
            if (uri == null) {
                return false;
            }
            for (AnonymousClass3GO A01 : r04.A00) {
                if (!A01.A01(uri)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
