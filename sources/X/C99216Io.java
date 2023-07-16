package X;

import android.util.Patterns;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6Io  reason: invalid class name and case insensitive filesystem */
public final class C99216Io {
    public static FormParams A00(FormLogEvents formLogEvents, FBPayLoggerData fBPayLoggerData, String str, String str2, boolean z) {
        int i = 2131826737;
        if (str == null) {
            i = 2131826736;
        }
        int i2 = 2131827695;
        if (str2 == null) {
            i2 = 0;
        }
        AnonymousClass7EL r4 = new AnonymousClass7EL(1, i, str2, i2);
        r4.A02 = fBPayLoggerData;
        r4.A01 = formLogEvents;
        C91895h1 r6 = new C91895h1(1);
        r6.A0F = str;
        r6.A0C = AnonymousClass006.A0u;
        r6.A03 = 2131823170;
        r6.A0G.add((Object) new TextValidatorParams(AnonymousClass006.A0N, Patterns.EMAIL_ADDRESS.pattern(), 2131823168, 0));
        TextCellParams A00 = r6.A00();
        ImmutableList.Builder builder = r4.A09;
        builder.add((Object) A00);
        C91885h0 r2 = new C91885h0(16);
        int i3 = 2131823169;
        if (AnonymousClass7HK.A01()) {
            i3 = 2131830504;
        }
        C109806ke A002 = C1196376f.A00(r2, builder, i3, z);
        A002.A03 = 2131827694;
        A002.A00 = 2131827692;
        return AnonymousClass7EL.A00(A002, r4, 2131827693);
    }
}
