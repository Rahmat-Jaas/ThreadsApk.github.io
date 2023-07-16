package X;

import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.graphql.impls.TypeaheadAddressDetailsImpl;
import com.facebook.redex.IDxObjectShape237S0100000_2_I2;
import com.facebook.redex.IDxObjectShape308S0100000_2_I2;
import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.form.cell.addresslist.AddressListCellParams;
import com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams;
import com.facebookpay.form.cell.checkbox.CheckboxCellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.formatter.NameFormatter;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.FormField;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.KtLambdaShape3S1300000_I2;

/* renamed from: X.5hV  reason: invalid class name and case insensitive filesystem */
public final class C92045hV extends C92055hW {
    public AddressTypeaheadController A00;
    public C92005hR A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final AddressFormFieldsConfig A0B;
    public final LoggingContext A0C;
    public final boolean A0D;
    public final int A0E;
    public final SparseArray A0F = C86154wM.A0D();
    public final List A0G;
    public final Map A0H;
    public final Set A0I;
    public final Set A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    private FormCellLoggingEvents A00(int i) {
        Map map = this.A0H;
        if (map != null) {
            return (FormCellLoggingEvents) C18200wM.A0f(map, i);
        }
        return null;
    }

    public static void A04(C91895h1 r2, FormField formField, String str) {
        r2.A04 = !formField.A04;
        r2.A0F = str;
        r2.A0G.addAll((Iterable) ImmutableList.copyOf((Collection) formField.A03));
    }

    public static void A05(C91895h1 r1, ImmutableList.Builder builder, String str, boolean z) {
        r1.A0D = str;
        r1.A08 = Boolean.valueOf(z);
        builder.add((Object) r1.A00());
    }

    public static void A06(C91895h1 r5, Integer num, Integer num2) {
        r5.A0G.addAll((Iterable) ImmutableList.of(new TextValidatorParams(num, "", 2131827729, 2131823176), new TextValidatorParams(num2, "^.*[\\S]+[ ]+[\\S]+.*$", 2131827729, 2131823176)));
        r5.A04 = new NameFormatter();
    }

    private boolean A07(SparseArray sparseArray, ImmutableList.Builder builder) {
        LoggingContext loggingContext;
        List list;
        if (!this.A0O || (loggingContext = this.A0C) == null || (list = this.A0G) == null || sparseArray.get(33) == null) {
            return false;
        }
        boolean A1X = C86134wK.A1X(list.size(), 2);
        if ((sparseArray.get(34) instanceof Boolean) && !AnonymousClass0wJ.A1X(sparseArray.get(34)) && A1X) {
            list = list.subList(0, 2);
        }
        builder.add((Object) new AddressListCellParams(new C91825gu((BaseCheckoutItem) sparseArray.get(33), loggingContext, list, this.A0L)));
        return true;
    }

    private boolean A08(SparseArray sparseArray, ImmutableList.Builder builder) {
        List list;
        boolean z;
        Integer num;
        boolean z2 = false;
        if (!this.A0O || (list = this.A0G) == null || list.isEmpty()) {
            return false;
        }
        if (list.size() > 2) {
            z = true;
            num = Integer.valueOf(C86144wL.A0C(list, 2));
        } else {
            z = false;
            num = null;
        }
        if (sparseArray.get(34) != null) {
            z2 = AnonymousClass0wJ.A1X(sparseArray.get(34));
        }
        int size = list.size();
        int i = R.string.f0nameremoved;
        if (size == 1) {
            i = R.string.f0nameremoved;
        }
        builder.add((Object) new AddressListHeaderCellParams(new C91835gv(num, i, z2, z)));
        return true;
    }

    private boolean A09(SparseArray sparseArray, ImmutableList.Builder builder) {
        int A042;
        List list;
        boolean z = false;
        if (sparseArray.get(24) == null || (A042 = AnonymousClass0wJ.A04(C86124wJ.A0k(sparseArray, 24))) == 0) {
            return false;
        }
        if (this.A0O && (list = this.A0G) != null && !list.isEmpty()) {
            z = true;
        }
        C91885h0 r1 = new C91885h0(24);
        r1.A03 = A042;
        r1.A07 = true;
        int i = R.attr.fbpay_hub_header_item_below_name_margin_top;
        if (z) {
            i = R.attr.fbpay_hub_header_item_within_billing_section_margin_top;
        }
        r1.A04 = i;
        builder.add((Object) r1.A00());
        return true;
    }

    private boolean A0A(SparseArray sparseArray, ImmutableList.Builder builder) {
        boolean A1X;
        if (!this.A0Q) {
            return false;
        }
        if (sparseArray.get(29) == null) {
            A1X = false;
        } else {
            A1X = AnonymousClass0wJ.A1X(sparseArray.get(29));
        }
        builder.add((Object) new CheckboxCellParams(new C91805gs(A1X, this.A0L)));
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x024c, code lost:
        if (r4.A0I.contains(r1) != false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x025e, code lost:
        if (r1 != false) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0260, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0261, code lost:
        r15.A02 = r0;
        A03(r15, r4, r12);
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0267, code lost:
        switch(r12) {
            case 7: goto L_0x027e;
            case 8: goto L_0x0282;
            default: goto L_0x026a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026a, code lost:
        r0 = "postalCode";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x027e, code lost:
        r0 = "addressLocality";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0282, code lost:
        r0 = "addressRegion";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ee, code lost:
        if (r4.A0I.contains(r1) != false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x043c, code lost:
        r15.A01 = r0;
        r1 = r15;
        r15.A0E = r13.A02;
        A04(r15, r13, r14);
        r15.A0A = r3;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0449, code lost:
        r15.A0D = r0;
        r15.A08 = java.lang.Boolean.valueOf(r4.A0L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0453, code lost:
        r0 = r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0457, code lost:
        r5.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        if (r6 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (X.C86114wI.A1Z(r4.A0J, 28) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0170, code lost:
        r1.A03 = r0;
        r1.A0A = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0186, code lost:
        r1.A0E = r13.A02;
        A03(r1, r4, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e1, code lost:
        if (r4.A0I.contains(9) != false) goto L_0x01e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.collect.ImmutableList A0M() {
        /*
            r23 = this;
            r4 = r23
            android.util.SparseArray r7 = X.C92055hW.A0B(r4)
            com.facebook.common.locale.Country r20 = r4.A0O()
            java.lang.String r1 = X.C86164wN.A0f(r20)
            com.facebookpay.form.model.AddressFormFieldsConfig r0 = r4.A0B
            java.util.List<com.facebookpay.form.model.FormCountry> r0 = r0.A01
            r22 = r0
            com.facebookpay.form.model.FormCountry r11 = X.AnonymousClass7BH.A01(r1, r0)
            com.google.common.collect.ImmutableList$Builder r5 = X.C86164wN.A0Q()
            java.util.HashSet r2 = X.C18200wM.A0u()
            r1 = 29
            java.lang.Object r0 = r7.get(r1)
            if (r0 != 0) goto L_0x00ad
            r21 = 0
        L_0x002a:
            r1 = 33
            java.lang.Object r0 = r7.get(r1)
            if (r0 != 0) goto L_0x00a6
            r10 = 1
        L_0x0033:
            X.56r r0 = r4.A07
            java.lang.Object r0 = r0.A08()
            r0.getClass()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x05bf
            int r1 = r4.A0E
            if (r1 == 0) goto L_0x006a
            r0 = 25
            X.5h0 r3 = new X.5h0
            r3.<init>(r0)
            r3.A03 = r1
            r0 = 1
            r3.A07 = r0
            boolean r1 = r4.A0K
            r0 = 2130969465(0x7f040379, float:1.7547613E38)
            if (r1 == 0) goto L_0x005a
            r0 = 0
        L_0x005a:
            r3.A04 = r0
            if (r1 == 0) goto L_0x0063
            r0 = 2130969513(0x7f0403a9, float:1.754771E38)
            r3.A00 = r0
        L_0x0063:
            com.facebookpay.form.cell.label.LabelCellParams r0 = r3.A00()
            r5.add((java.lang.Object) r0)
        L_0x006a:
            java.lang.String r19 = ""
            if (r11 == 0) goto L_0x0490
            java.util.List<com.facebookpay.form.model.FormField> r12 = r11.A01
            java.util.Iterator r14 = r12.iterator()
            r18 = 1
            r13 = 0
            r6 = 0
        L_0x0078:
            boolean r0 = r14.hasNext()
            java.lang.String r9 = "state"
            java.lang.String r8 = "zip"
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r3 = r14.next()
            com.facebookpay.form.model.FormField r3 = (com.facebookpay.form.model.FormField) r3
            java.lang.String r1 = r3.A01
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x009e
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0078
            boolean r0 = r3.A04
            r0 = r0 ^ 1
            r18 = r18 & r0
            r13 = 1
            goto L_0x0078
        L_0x009e:
            boolean r0 = r3.A04
            r0 = r0 ^ 1
            r18 = r18 & r0
            r6 = 1
            goto L_0x0078
        L_0x00a6:
            java.lang.Object r0 = r7.get(r1)
            boolean r10 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            goto L_0x0033
        L_0x00ad:
            java.lang.Object r0 = r7.get(r1)
            boolean r21 = X.AnonymousClass0wJ.A1X(r0)
            goto L_0x002a
        L_0x00b7:
            if (r13 == 0) goto L_0x00bc
            r0 = 1
            if (r6 != 0) goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r18 = r18 & r0
            boolean r6 = r4.A0M
            if (r6 == 0) goto L_0x00ce
            java.util.Set r1 = r4.A0J
            r0 = 28
            boolean r1 = X.C86114wI.A1Z(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x00cf
        L_0x00ce:
            r0 = 0
        L_0x00cf:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            java.util.Iterator r17 = r12.iterator()
        L_0x00d7:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x046b
            java.lang.Object r13 = r17.next()
            com.facebookpay.form.model.FormField r13 = (com.facebookpay.form.model.FormField) r13
            java.lang.String r1 = r13.A01
            int r0 = r1.hashCode()
            switch(r0) {
                case -1881886578: goto L_0x00ed;
                case -1881886577: goto L_0x0137;
                case 120609: goto L_0x018f;
                case 3053931: goto L_0x0203;
                case 109757585: goto L_0x0286;
                case 498460430: goto L_0x0321;
                case 553963973: goto L_0x0356;
                case 957831062: goto L_0x03e7;
                case 1538830798: goto L_0x0418;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x00d7
        L_0x00ed:
            java.lang.String r0 = "street1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
            if (r10 == 0) goto L_0x00d7
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0127
            r14 = r19
            r12 = 5
        L_0x0106:
            X.C18200wM.A1U(r2, r12)
            X.5h1 r1 = new X.5h1
            r1.<init>(r12)
            int r0 = r4.A07
            r1.A01 = r0
            A04(r1, r13, r14)
            java.lang.String r0 = "streetAddress"
            r1.A0D = r0
            boolean r0 = r4.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A08 = r0
            if (r6 == 0) goto L_0x0186
            r0 = 2131823144(0x7f110a28, float:1.927908E38)
            goto L_0x0170
        L_0x0127:
            android.util.SparseArray r1 = r4.A0F
            r12 = 5
            java.lang.Object r0 = r1.get(r12)
            if (r0 != 0) goto L_0x0132
            android.util.SparseArray r1 = r4.A04
        L_0x0132:
            java.lang.String r14 = X.C86114wI.A0m(r1, r12)
            goto L_0x0106
        L_0x0137:
            java.lang.String r0 = "street2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
            if (r10 == 0) goto L_0x00d7
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x0176
            r14 = r19
            r12 = 6
        L_0x0150:
            X.C18200wM.A1U(r2, r12)
            X.5h1 r1 = new X.5h1
            r1.<init>(r12)
            int r0 = r4.A08
            r1.A01 = r0
            A04(r1, r13, r14)
            java.lang.String r0 = "extendedAddress"
            r1.A0D = r0
            boolean r0 = r4.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A08 = r0
            if (r6 == 0) goto L_0x0186
            r0 = 2131823145(0x7f110a29, float:1.9279081E38)
        L_0x0170:
            r1.A03 = r0
            r1.A0A = r3
            goto L_0x0453
        L_0x0176:
            android.util.SparseArray r1 = r4.A0F
            r12 = 6
            java.lang.Object r0 = r1.get(r12)
            if (r0 != 0) goto L_0x0181
            android.util.SparseArray r1 = r4.A04
        L_0x0181:
            java.lang.String r14 = X.C86114wI.A0m(r1, r12)
            goto L_0x0150
        L_0x0186:
            java.lang.String r0 = r13.A02
            r1.A0E = r0
            A03(r1, r4, r12)
            goto L_0x0453
        L_0x018f:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
            if (r10 == 0) goto L_0x00d7
            java.util.Set r14 = r4.A0J
            r12 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            boolean r0 = r14.contains(r1)
            if (r0 == 0) goto L_0x01f4
            r16 = r19
        L_0x01a9:
            r2.add(r1)
            X.5h1 r15 = new X.5h1
            r15.<init>(r12)
            int r0 = r4.A0A
            r15.A01 = r0
            java.lang.String r0 = r13.A02
            r15.A0E = r0
            java.lang.Integer r0 = r13.A00
            r15.A0C = r0
            java.util.List<com.facebookpay.form.cell.text.TextValidatorParams> r0 = r13.A03
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            com.google.common.collect.ImmutableList$Builder r0 = r15.A0G
            r0.addAll((java.lang.Iterable) r13)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r18 == 0) goto L_0x01ce
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x01ce:
            r15.A00 = r0
            r0 = r16
            r15.A0F = r0
            boolean r0 = r14.contains(r1)
            if (r0 != 0) goto L_0x01e3
            java.util.Set r0 = r4.A0I
            boolean r13 = r0.contains(r1)
            r0 = 0
            if (r13 == 0) goto L_0x01e4
        L_0x01e3:
            r0 = 1
        L_0x01e4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0A = r0
            java.util.Set r0 = r4.A0I
            boolean r1 = r0.contains(r1)
            r0 = 2131823196(0x7f110a5c, float:1.9279185E38)
            goto L_0x025e
        L_0x01f4:
            android.util.SparseArray r15 = r4.A0F
            java.lang.Object r0 = r15.get(r12)
            if (r0 != 0) goto L_0x01fe
            android.util.SparseArray r15 = r4.A04
        L_0x01fe:
            java.lang.String r16 = X.C86114wI.A0m(r15, r12)
            goto L_0x01a9
        L_0x0203:
            java.lang.String r0 = "city"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
            if (r10 == 0) goto L_0x00d7
            boolean r16 = r3.booleanValue()
            if (r16 == 0) goto L_0x026e
            r14 = r19
            r12 = 7
        L_0x021c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            X.5h1 r15 = new X.5h1
            r15.<init>(r12)
            int r0 = r4.A02
            r15.A01 = r0
            java.lang.String r0 = r13.A02
            r15.A0E = r0
            boolean r0 = r13.A04
            r0 = r0 ^ 1
            r15.A04 = r0
            r15.A0F = r14
            java.util.List<com.facebookpay.form.cell.text.TextValidatorParams> r0 = r13.A03
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            com.google.common.collect.ImmutableList$Builder r0 = r15.A0G
            r0.addAll((java.lang.Iterable) r13)
            if (r16 != 0) goto L_0x024e
            java.util.Set r0 = r4.A0I
            boolean r13 = r0.contains(r1)
            r0 = 0
            if (r13 == 0) goto L_0x024f
        L_0x024e:
            r0 = 1
        L_0x024f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0A = r0
            java.util.Set r0 = r4.A0I
            boolean r1 = r0.contains(r1)
            r0 = 2131823153(0x7f110a31, float:1.9279098E38)
        L_0x025e:
            if (r1 != 0) goto L_0x0261
            r0 = 0
        L_0x0261:
            r15.A02 = r0
            A03(r15, r4, r12)
            r1 = r15
            switch(r12) {
                case 7: goto L_0x027e;
                case 8: goto L_0x0282;
                default: goto L_0x026a;
            }
        L_0x026a:
            java.lang.String r0 = "postalCode"
            goto L_0x0449
        L_0x026e:
            android.util.SparseArray r1 = r4.A0F
            r12 = 7
            java.lang.Object r0 = r1.get(r12)
            if (r0 != 0) goto L_0x0279
            android.util.SparseArray r1 = r4.A04
        L_0x0279:
            java.lang.String r14 = X.C86114wI.A0m(r1, r12)
            goto L_0x021c
        L_0x027e:
            java.lang.String r0 = "addressLocality"
            goto L_0x0449
        L_0x0282:
            java.lang.String r0 = "addressRegion"
            goto L_0x0449
        L_0x0286:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
            if (r10 == 0) goto L_0x00d7
            boolean r16 = r3.booleanValue()
            if (r16 == 0) goto L_0x030f
            r14 = r19
            r12 = 8
        L_0x029e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r2.add(r1)
            X.5h1 r15 = new X.5h1
            r15.<init>(r12)
            int r0 = r4.A06
            r15.A01 = r0
            java.lang.String r0 = r13.A02
            r15.A0E = r0
            r0 = 2131823189(0x7f110a55, float:1.927917E38)
            r15.A00 = r0
            r15.A0F = r14
            com.facebook.common.locale.Country r0 = r11.A00
            java.lang.String r14 = X.C86164wN.A0f(r0)
            java.lang.String r0 = "US"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x030d
            com.facebookpay.form.cell.text.formatter.UpperCaseFormatter r0 = new com.facebookpay.form.cell.text.formatter.UpperCaseFormatter
            r0.<init>()
        L_0x02cc:
            r15.A04 = r0
            java.lang.Integer r0 = r13.A00
            r15.A0C = r0
            java.util.List<com.facebookpay.form.cell.text.TextValidatorParams> r0 = r13.A03
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            com.google.common.collect.ImmutableList$Builder r0 = r15.A0G
            r0.addAll((java.lang.Iterable) r13)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r18 == 0) goto L_0x02e3
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x02e3:
            r15.A00 = r0
            if (r16 != 0) goto L_0x02f0
            java.util.Set r0 = r4.A0I
            boolean r13 = r0.contains(r1)
            r0 = 0
            if (r13 == 0) goto L_0x02f1
        L_0x02f0:
            r0 = 1
        L_0x02f1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0A = r0
            java.util.Set r0 = r4.A0I
            boolean r1 = r0.contains(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0303
            r0 = 2131823192(0x7f110a58, float:1.9279177E38)
        L_0x0303:
            r15.A02 = r0
            A03(r15, r4, r12)
            r1 = r15
            java.lang.String r0 = "addressRegion"
            goto L_0x0449
        L_0x030d:
            r0 = 0
            goto L_0x02cc
        L_0x030f:
            android.util.SparseArray r1 = r4.A0F
            r12 = 8
            java.lang.Object r0 = r1.get(r12)
            if (r0 != 0) goto L_0x031b
            android.util.SparseArray r1 = r4.A04
        L_0x031b:
            java.lang.String r14 = X.C86114wI.A0m(r1, r12)
            goto L_0x029e
        L_0x0321:
            java.lang.String r0 = "neighborhood"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
            if (r10 == 0) goto L_0x00d7
            boolean r0 = r3.booleanValue()
            r12 = 30
            if (r0 == 0) goto L_0x0347
            r14 = r19
        L_0x033b:
            X.C18200wM.A1U(r2, r12)
            X.5h1 r15 = new X.5h1
            r15.<init>(r12)
            int r0 = r4.A05
            goto L_0x043c
        L_0x0347:
            android.util.SparseArray r1 = r4.A0F
            java.lang.Object r0 = r1.get(r12)
            if (r0 != 0) goto L_0x0351
            android.util.SparseArray r1 = r4.A04
        L_0x0351:
            java.lang.String r14 = X.C86114wI.A0m(r1, r12)
            goto L_0x033b
        L_0x0356:
            java.lang.String r0 = "care_of"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x00d7
            boolean r0 = r4.A08(r7, r5)
            if (r0 == 0) goto L_0x036d
            r0 = 34
            X.C18200wM.A1U(r2, r0)
        L_0x036d:
            boolean r0 = r4.A07(r7, r5)
            if (r0 == 0) goto L_0x0378
            r0 = 33
            X.C18200wM.A1U(r2, r0)
        L_0x0378:
            r1 = 24
            if (r10 == 0) goto L_0x03e1
            boolean r0 = r4.A09(r7, r5)
            if (r0 == 0) goto L_0x0385
            X.C18200wM.A1U(r2, r1)
        L_0x0385:
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x03cf
            android.util.SparseArray r1 = r4.A0F
            r12 = 2
            java.lang.Object r0 = r1.get(r12)
            if (r0 != 0) goto L_0x0394
            android.util.SparseArray r1 = r4.A04
        L_0x0394:
            java.lang.String r14 = X.C86114wI.A0m(r1, r12)
            X.C18200wM.A1U(r2, r12)
            X.5h1 r1 = new X.5h1
            r1.<init>(r12)
            int r0 = r4.A04
            r1.A01 = r0
            A04(r1, r13, r14)
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            r1.A0C = r0
            com.facebookpay.form.cell.text.formatter.NameFormatter r0 = new com.facebookpay.form.cell.text.formatter.NameFormatter
            r0.<init>()
            r1.A04 = r0
            A03(r1, r4, r12)
            java.lang.String r0 = "personName"
            r1.A0D = r0
            boolean r0 = r4.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A08 = r0
            if (r6 == 0) goto L_0x03dc
            r0 = 2131823147(0x7f110a2b, float:1.9279085E38)
            r1.A03 = r0
        L_0x03c8:
            com.facebookpay.form.cell.text.TextCellParams r0 = r1.A00()
            r5.add((java.lang.Object) r0)
        L_0x03cf:
            boolean r0 = r4.A0A(r7, r5)
            if (r0 == 0) goto L_0x00d7
            r0 = 29
        L_0x03d7:
            X.C18200wM.A1U(r2, r0)
            goto L_0x00d7
        L_0x03dc:
            java.lang.String r0 = r13.A02
            r1.A0E = r0
            goto L_0x03c8
        L_0x03e1:
            r0 = 29
            X.C18200wM.A1U(r2, r1)
            goto L_0x03d7
        L_0x03e7:
            java.lang.String r0 = "country"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
            r12 = 10
            X.C18200wM.A1U(r2, r12)
            if (r10 == 0) goto L_0x00d7
            com.google.common.collect.ImmutableList r14 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r22)
            X.5gw r1 = new X.5gw
            r0 = r20
            r1.<init>(r0, r14)
            int r0 = r4.A03
            r1.A01 = r0
            java.lang.String r0 = r13.A02
            r1.A02 = r0
            A03(r1, r4, r12)
            boolean r0 = r4.A0L
            r1.A03 = r0
            com.facebookpay.form.cell.selector.CountrySelectorCellParams r0 = new com.facebookpay.form.cell.selector.CountrySelectorCellParams
            r0.<init>(r1)
            goto L_0x0457
        L_0x0418:
            java.lang.String r0 = "subdistrict"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r4.A0N
            if (r0 != 0) goto L_0x00d7
            if (r21 != 0) goto L_0x00d7
            if (r10 == 0) goto L_0x00d7
            boolean r0 = r3.booleanValue()
            r12 = 31
            if (r0 == 0) goto L_0x045c
            r14 = r19
        L_0x0432:
            X.C18200wM.A1U(r2, r12)
            X.5h1 r15 = new X.5h1
            r15.<init>(r12)
            int r0 = r4.A09
        L_0x043c:
            r15.A01 = r0
            r1 = r15
            java.lang.String r0 = r13.A02
            r15.A0E = r0
            A04(r15, r13, r14)
            r15.A0A = r3
            r0 = 0
        L_0x0449:
            r15.A0D = r0
            boolean r0 = r4.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A08 = r0
        L_0x0453:
            com.facebookpay.form.cell.text.TextCellParams r0 = r1.A00()
        L_0x0457:
            r5.add((java.lang.Object) r0)
            goto L_0x00d7
        L_0x045c:
            android.util.SparseArray r1 = r4.A0F
            java.lang.Object r0 = r1.get(r12)
            if (r0 != 0) goto L_0x0466
            android.util.SparseArray r1 = r4.A04
        L_0x0466:
            java.lang.String r14 = X.C86114wI.A0m(r1, r12)
            goto L_0x0432
        L_0x046b:
            int r1 = r7.size()
            r0 = 1
            int r1 = r1 - r0
        L_0x0471:
            if (r1 < 0) goto L_0x05bf
            int r0 = r7.keyAt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x048d
            android.util.SparseArray r0 = r4.A0F
            X.C86134wK.A1A(r7, r0, r1)
            int r0 = r7.keyAt(r1)
            r7.remove(r0)
        L_0x048d:
            int r1 = r1 + -1
            goto L_0x0471
        L_0x0490:
            r4.A08(r7, r5)
            r4.A07(r7, r5)
            if (r10 == 0) goto L_0x05bf
            r4.A09(r7, r5)
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x04da
            r3 = 2
            X.5h1 r2 = new X.5h1
            r2.<init>(r3)
            int r0 = r4.A04
            r2.A01 = r0
            boolean r1 = r4.A0M
            r0 = 2131823137(0x7f110a21, float:1.9279065E38)
            if (r1 == 0) goto L_0x04b3
            r0 = 2131823147(0x7f110a2b, float:1.9279085E38)
        L_0x04b3:
            r2.A03 = r0
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            r2.A0C = r1
            java.lang.Integer r0 = X.AnonymousClass006.A0Y
            A06(r2, r0, r1)
            java.lang.String r0 = X.C86114wI.A0m(r7, r3)
            r2.A0F = r0
            A03(r2, r4, r3)
            java.lang.String r0 = "personName"
            r2.A0D = r0
            boolean r0 = r4.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A08 = r0
            com.facebookpay.form.cell.text.TextCellParams r0 = r2.A00()
            r5.add((java.lang.Object) r0)
        L_0x04da:
            r4.A0A(r7, r5)
            if (r21 != 0) goto L_0x05bf
            r2 = 5
            X.5h1 r1 = new X.5h1
            r1.<init>(r2)
            int r0 = r4.A07
            r1.A01 = r0
            boolean r3 = r4.A0M
            r0 = 2131823140(0x7f110a24, float:1.9279071E38)
            if (r3 == 0) goto L_0x04f3
            r0 = 2131823144(0x7f110a28, float:1.927908E38)
        L_0x04f3:
            r1.A03 = r0
            java.lang.String r0 = X.C86114wI.A0m(r7, r2)
            r1.A0F = r0
            A03(r1, r4, r2)
            java.lang.String r0 = "streetAddress"
            r1.A0D = r0
            boolean r6 = r4.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A08 = r0
            com.facebookpay.form.cell.text.TextCellParams r0 = r1.A00()
            r5.add((java.lang.Object) r0)
            r2 = 6
            X.5h1 r1 = new X.5h1
            r1.<init>(r2)
            int r0 = r4.A08
            r1.A01 = r0
            r0 = 2131823141(0x7f110a25, float:1.9279073E38)
            if (r3 == 0) goto L_0x0523
            r0 = 2131823145(0x7f110a29, float:1.9279081E38)
        L_0x0523:
            r1.A03 = r0
            r0 = 0
            r1.A04 = r0
            java.lang.String r0 = X.C86114wI.A0m(r7, r2)
            r1.A0F = r0
            A03(r1, r4, r2)
            java.lang.String r0 = "extendedAddress"
            A05(r1, r5, r0, r6)
            r2 = 7
            X.5h1 r1 = new X.5h1
            r1.<init>(r2)
            int r0 = r4.A02
            r1.A01 = r0
            r0 = 2131823133(0x7f110a1d, float:1.9279057E38)
            r1.A03 = r0
            java.lang.String r0 = X.C86114wI.A0m(r7, r2)
            r1.A0F = r0
            A03(r1, r4, r2)
            java.lang.String r0 = "addressLocality"
            A05(r1, r5, r0, r6)
            r2 = 8
            X.5h1 r1 = new X.5h1
            r1.<init>(r2)
            int r0 = r4.A06
            r1.A01 = r0
            r0 = 2131823139(0x7f110a23, float:1.927907E38)
            r1.A03 = r0
            java.lang.String r0 = X.C86114wI.A0m(r7, r2)
            r1.A0F = r0
            com.facebookpay.form.cell.text.formatter.UpperCaseFormatter r0 = new com.facebookpay.form.cell.text.formatter.UpperCaseFormatter
            r0.<init>()
            r1.A04 = r0
            r3 = 1056964608(0x3f000000, float:0.5)
            r1.A00 = r3
            A03(r1, r4, r2)
            java.lang.String r0 = "addressRegion"
            A05(r1, r5, r0, r6)
            r2 = 9
            X.5h1 r1 = new X.5h1
            r1.<init>(r2)
            int r0 = r4.A0A
            r1.A01 = r0
            r0 = 2131823143(0x7f110a27, float:1.9279077E38)
            r1.A03 = r0
            r1.A00 = r3
            java.lang.String r0 = X.C86114wI.A0m(r7, r2)
            r1.A0F = r0
            A03(r1, r4, r2)
            java.lang.String r0 = "postalCode"
            A05(r1, r5, r0, r6)
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r22)
            r2 = 10
            X.5gw r1 = new X.5gw
            r0 = r20
            r1.<init>(r0, r3)
            int r0 = r4.A03
            r1.A01 = r0
            r0 = 2131823134(0x7f110a1e, float:1.927906E38)
            r1.A00 = r0
            A03(r1, r4, r2)
            r1.A03 = r6
            com.facebookpay.form.cell.selector.CountrySelectorCellParams r0 = new com.facebookpay.form.cell.selector.CountrySelectorCellParams
            r0.<init>(r1)
            r5.add((java.lang.Object) r0)
        L_0x05bf:
            com.google.common.collect.ImmutableList r0 = r5.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92045hV.A0M():com.google.common.collect.ImmutableList");
    }

    private void A01(int i, String str, List list) {
        Map map;
        AnonymousClass7Ih A0F2 = A0F(i);
        if (A0F2 instanceof C92005hR) {
            C92005hR r1 = (C92005hR) A0F2;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            r1.A0F.A0H(new C108846j3(str2, false, true));
            if (!TextUtils.isEmpty(str) && (map = this.A0H) != null) {
                Integer valueOf = Integer.valueOf(i);
                if (map.get(valueOf) != null) {
                    list.add(((FormCellLoggingEvents) C86104wH.A0h(valueOf, map)).A00.A03);
                }
            }
        }
    }

    public static void A02(TypeaheadAddressDetailsImpl typeaheadAddressDetailsImpl, C92045hV r6) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        r6.A01(5, typeaheadAddressDetailsImpl.getStringValue("address_line_1"), A0v);
        r6.A01(6, typeaheadAddressDetailsImpl.getStringValue("address_line_2"), A0v);
        r6.A01(7, typeaheadAddressDetailsImpl.getStringValue(ServerW3CShippingAddressConstants.CITY), A0v);
        r6.A01(9, typeaheadAddressDetailsImpl.getStringValue("postal_code"), A0v);
        String stringValue = typeaheadAddressDetailsImpl.getStringValue("state_code");
        if (stringValue == null) {
            stringValue = typeaheadAddressDetailsImpl.getStringValue(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        }
        r6.A01(8, stringValue, A0v);
        C1198277d r0 = r6.A00;
        if (r0 != null) {
            C128957ke A002 = AnonymousClass7JJ.A00();
            LoggingContext loggingContext = r0.A01;
            LinkedHashMap A072 = AnonymousClass7Kr.A07(r0.A00);
            C04220Ms.A0B(loggingContext, 0);
            C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_add_ecpaddresstypeahead_success"), 184), loggingContext, new KtLambdaShape3S1300000_I2((Object) A0v, (Object) A072, (Object) loggingContext, "address_typeahead", 2));
        }
    }

    public static void A03(C110616lz r1, C92045hV r2, int i) {
        r1.A02 = r2.A00(i);
    }

    public final void A0G() {
        super.A0G();
        AddressTypeaheadController addressTypeaheadController = this.A00;
        if (addressTypeaheadController != null) {
            AnonymousClass7Ja.A05((CancellationException) null, addressTypeaheadController.A0A);
        }
    }

    public final void A0N() {
        super.A0N();
        AnonymousClass7Ih A0F2 = A0F(5);
        if (A0F2 instanceof C92005hR) {
            this.A01 = (C92005hR) A0F2;
            if (this.A00 != null) {
                A0F2.A05.A0E(C86114wI.A0Q(this, 61));
            }
        }
    }

    public final Country A0O() {
        SparseArray A0B2 = C92055hW.A0B(this);
        if (A0B2.get(10) != null) {
            return (Country) A0B2.get(10);
        }
        return this.A0B.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92045hV(Country country, AddressFormFieldsConfig addressFormFieldsConfig, LoggingContext loggingContext, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, Map map, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        super(i, z, z2);
        LoggingContext loggingContext2;
        Country country2 = country;
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        int i13 = i4;
        int i14 = i5;
        int i15 = i6;
        int i16 = i7;
        int i17 = i8;
        String str13 = str5;
        int i18 = i9;
        String str14 = str6;
        int i19 = i10;
        String str15 = str7;
        int i20 = i11;
        String str16 = str8;
        HashSet A0u = C18200wM.A0u();
        this.A0J = A0u;
        HashSet A0u2 = C18200wM.A0u();
        this.A0I = A0u2;
        this.A0N = z3;
        this.A0Q = z4;
        this.A0M = z5;
        this.A0O = z6;
        this.A0P = z7;
        this.A04 = i3 == 0 ? R.id.full_name_field : i3;
        this.A07 = i3 == 0 ? R.id.street1_field : i13;
        this.A08 = i3 == 0 ? R.id.street2_field : i14;
        this.A05 = i3 == 0 ? R.id.neighborhood_field : i15;
        this.A09 = i3 == 0 ? R.id.subdistrict_field : i16;
        this.A02 = i3 == 0 ? R.id.city_field : i17;
        this.A06 = i3 == 0 ? R.id.state_field : i18;
        this.A0A = i3 == 0 ? R.id.zip_code_field : i19;
        this.A03 = i3 == 0 ? R.id.country_field : i20;
        this.A0H = map;
        this.A0C = loggingContext;
        List list2 = list;
        this.A0G = list2;
        this.A0L = z8;
        this.A0E = i12;
        this.A0K = z9;
        this.A0D = z10;
        if (z4) {
            this.A04.put(29, C18180wK.A0Y());
        }
        if (z6 && list != null && !list2.isEmpty()) {
            SparseArray sparseArray = this.A04;
            sparseArray.put(34, false);
            sparseArray.put(33, list2.get(0));
        }
        SparseArray sparseArray2 = this.A04;
        sparseArray2.put(2, str == null ? "" : str12);
        sparseArray2.put(5, str2 == null ? "" : str11);
        sparseArray2.put(6, str3 == null ? "" : str10);
        sparseArray2.put(30, str4 == null ? "" : str9);
        sparseArray2.put(31, str5 == null ? "" : str13);
        sparseArray2.put(7, str6 == null ? "" : str14);
        sparseArray2.put(9, str7 == null ? "" : str15);
        sparseArray2.put(8, str8 == null ? "" : str16);
        sparseArray2.put(24, Integer.valueOf(i2));
        AddressFormFieldsConfig addressFormFieldsConfig2 = addressFormFieldsConfig;
        sparseArray2.put(10, country == null ? Country.A00((Country) null, C86164wN.A0f(addressFormFieldsConfig2.A00)) : country2);
        ImmutableList immutableList3 = immutableList;
        if (immutableList != null && !immutableList3.isEmpty()) {
            A0u.addAll(immutableList3);
        }
        ImmutableList immutableList4 = immutableList2;
        if (immutableList2 != null && !immutableList4.isEmpty()) {
            A0u2.addAll(immutableList4);
        }
        this.A05.A0H(sparseArray2.clone());
        this.A0B = addressFormFieldsConfig2;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36315735194405615L) && (loggingContext2 = this.A0C) != null) {
            AddressTypeaheadController addressTypeaheadController = new AddressTypeaheadController(loggingContext2, new IDxObjectShape237S0100000_2_I2(this, 0), new IDxObjectShape308S0100000_2_I2((Object) this, 4));
            this.A00 = addressTypeaheadController;
            addressTypeaheadController.A04.A0E(C86114wI.A0Q(this, 60));
            this.A00.A03.A0E(C86114wI.A0Q(this, 59));
        }
        A0N();
    }
}
