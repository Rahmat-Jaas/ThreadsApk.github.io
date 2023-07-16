package X;

import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;

/* renamed from: X.6Im  reason: invalid class name and case insensitive filesystem */
public final class C99196Im {
    public static FormParams A00(AddressFormFieldsConfig addressFormFieldsConfig, FormLogEvents formLogEvents, FBPayLoggerData fBPayLoggerData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z) {
        int i = 2131835780;
        if (str == null) {
            i = 2131835779;
        }
        int i2 = 2131827686;
        if (str == null) {
            i2 = 0;
        }
        AnonymousClass7EL r1 = new AnonymousClass7EL(2, i, str, i2);
        r1.A02 = fBPayLoggerData;
        r1.A01 = formLogEvents;
        C91895h1 r2 = new C91895h1(4);
        r2.A03 = 2131823138;
        r2.A0F = str2;
        TextCellParams A00 = r2.A00();
        ImmutableList.Builder builder = r1.A09;
        builder.add((Object) A00);
        C91875gz r22 = new C91875gz(addressFormFieldsConfig, 11);
        r22.A0F = str3;
        r22.A0L = str4;
        r22.A0G = str5;
        r22.A0H = str6;
        r22.A0J = str7;
        r22.A0K = str8;
        String str10 = str9;
        Country country = null;
        if (str9 != null) {
            country = Country.A00((Country) null, str10);
        }
        r22.A0B = country;
        builder.add((Object) new AddressCellParams(r22));
        C91885h0 r3 = new C91885h0(16);
        int i3 = 2131823136;
        if (AnonymousClass7HK.A01()) {
            i3 = 2131830502;
        }
        C109806ke A002 = C1196376f.A00(r3, builder, i3, z);
        A002.A03 = 2131827685;
        A002.A00 = 2131827683;
        return AnonymousClass7EL.A00(A002, r1, 2131827684);
    }
}
