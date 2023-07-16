package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: X.6CK  reason: invalid class name */
public final class AnonymousClass6CK extends Exception {
    public final ImmutableList A00;

    public final C146138lh A00() {
        ImmutableList immutableList = this.A00;
        if (immutableList != null) {
            return (C146138lh) AnonymousClass00J.A0D(immutableList);
        }
        return null;
    }

    public AnonymousClass6CK(List list) {
        this.A00 = C18220wO.A0S(list);
    }

    public final String getMessage() {
        C146138lh A002 = A00();
        if (!(A002 instanceof C95165yz)) {
            return null;
        }
        try {
            C95165yz r4 = (C95165yz) A002;
            StringWriter A0d = C18230wP.A0d();
            MMp A0K = C18180wK.A0K(A0d);
            A0K.A0b(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, r4.A00);
            String str = r4.A06;
            if (str != null) {
                A0K.A0d("summary", str);
            }
            String str2 = r4.A02;
            if (str2 != null) {
                A0K.A0d(DevServerEntity.COLUMN_DESCRIPTION, str2);
            }
            String str3 = r4.A01;
            if (str3 != null) {
                A0K.A0d("debug_info", str3);
            }
            String str4 = r4.A05;
            if (str4 != null) {
                A0K.A0d("severity", str4);
            }
            String str5 = r4.A03;
            if (str5 != null) {
                A0K.A0d(DialogModule.KEY_MESSAGE, str5);
            }
            A0K.A0e("is_silent", r4.A08);
            A0K.A0e("requires_reauth", r4.A07);
            A0K.A0e("is_transient", r4.A09);
            String str6 = r4.A04;
            if (str6 != null) {
                A0K.A0d("query_path", str6);
            }
            return C18180wK.A0h(A0K, A0d);
        } catch (IOException unused) {
            throw C18190wL.A0a("exception on serialize to json");
        }
    }
}
