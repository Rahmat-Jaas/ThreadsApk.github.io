package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.IGRevShareProductType;

/* renamed from: X.3Do  reason: invalid class name and case insensitive filesystem */
public final class C58033Do {
    public final Fragment A00(IGRevShareProductType iGRevShareProductType, String str, String str2) {
        C04220Ms.A0B(iGRevShareProductType, 2);
        C27041rq r2 = new C27041rq();
        Bundle A06 = C18180wK.A06();
        if (str != null) {
            A06.putString("ARGUMENT_ENTRY_POINT", str);
            A06.putString("ARGUMENT_ENTRY_EXTRA", str2);
            A06.putParcelable("ARGUMENT_PRODUCT_TYPE", iGRevShareProductType);
        }
        r2.setArguments(A06);
        return r2;
    }
}
