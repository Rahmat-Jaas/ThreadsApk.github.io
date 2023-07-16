package X;

import com.facebook.graphql.impls.PayoutRecordItemImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape71S0200000_2_I2;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.6IE  reason: invalid class name */
public final class AnonymousClass6IE {
    public static final void A00(AnonymousClass7Kx r18, ImmutableList.Builder builder, AnonymousClass0YY r20, boolean z) {
        C128077iJ r4;
        String str;
        String stringValue;
        IDxCListenerShape71S0200000_2_I2 iDxCListenerShape71S0200000_2_I2;
        String str2;
        String str3;
        String str4;
        Integer num;
        boolean z2;
        String str5;
        String A0k;
        AnonymousClass7Kx r6 = r18;
        C04220Ms.A0B(r6, 1);
        if (z) {
            r4 = new C128077iJ(4, 4, 2, 1);
        } else {
            r4 = null;
        }
        AbstractCollection abstractCollection = (AbstractCollection) r6.A01;
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                TreeJNI A0G = C18210wN.A0G(it);
                Locale A0O = AnonymousClass7Kz.A0O();
                if (A0G != null) {
                    str = A0G.getStringValue("payout_record_start_date");
                } else {
                    str = null;
                }
                if (str != null) {
                    String A00 = AnonymousClass6IR.A00(AnonymousClass7Kz.A0O(), str);
                    if (A0G == null || (stringValue = A0G.getStringValue("payout_record_end_date")) == null) {
                        throw C18180wK.A0a("Required value was null.");
                    }
                    C128107it A01 = C128107it.A01(C86154wM.A0o(A0O, "%s - %s", C86144wL.A1a(A00, AnonymousClass6IR.A00(AnonymousClass7Kz.A0O(), stringValue))));
                    AnonymousClass0YY r12 = r20;
                    if (r20 != null) {
                        iDxCListenerShape71S0200000_2_I2 = C86164wN.A0L(A0G, r12, 22);
                    } else {
                        iDxCListenerShape71S0200000_2_I2 = null;
                    }
                    AnonymousClass5iR A002 = AnonymousClass5iR.A00(16);
                    AnonymousClass5iC r9 = new AnonymousClass5iC();
                    Class<PayoutRecordItemImpl.Payee> cls = PayoutRecordItemImpl.Payee.class;
                    TreeJNI treeValue = A0G.getTreeValue("payee", cls);
                    if (treeValue != null) {
                        str2 = treeValue.getStringValue("payee_profile_uri");
                    } else {
                        str2 = null;
                    }
                    r9.A01 = new C128057iH(str2, (String) null, true, true);
                    C92375iF A03 = C128387jU.A03(r9, A002);
                    TreeJNI treeValue2 = A0G.getTreeValue("payee", cls);
                    if (treeValue2 != null) {
                        str3 = treeValue2.getStringValue("payee_name");
                    } else {
                        str3 = null;
                    }
                    C128107it A012 = C128107it.A01(str3);
                    AnonymousClass69Q r7 = AnonymousClass69Q.PRIMARY_TEXT;
                    C121777Ib.A02(A012, A03, r7);
                    C128107it A003 = C128107it.A00(A0G, "payout_record_product_subtype_name");
                    AnonymousClass69Q r14 = AnonymousClass69Q.A0z;
                    A03.A02 = new C121777Ib((C146998nD) null, A003, r14);
                    A03.A03 = new C121777Ib((C146998nD) null, A01, r14);
                    A03.A03 = false;
                    AnonymousClass5iL.A01(A002, A03, 1);
                    C92355iD r142 = new C92355iD();
                    Class<PayoutRecordItemImpl.PayoutRecordPayoutAmount> cls2 = PayoutRecordItemImpl.PayoutRecordPayoutAmount.class;
                    TreeJNI treeValue3 = A0G.getTreeValue("payout_record_payout_amount", cls2);
                    if (treeValue3 != null) {
                        str4 = C86154wM.A0k(treeValue3);
                    } else {
                        str4 = null;
                    }
                    r142.A01 = new C121777Ib((C146998nD) null, C128107it.A01(str4), r7);
                    r142.A00 = r4;
                    r142.A03 = false;
                    A002.A06 = new C92405iJ(r142);
                    A002.A03 = iDxCListenerShape71S0200000_2_I2;
                    if (r20 != null) {
                        num = AnonymousClass006.A01;
                        z2 = true;
                    } else {
                        num = AnonymousClass006.A00;
                        z2 = false;
                    }
                    String str6 = "";
                    TreeJNI treeValue4 = A0G.getTreeValue("payee", cls);
                    if (treeValue4 == null || (str5 = treeValue4.getStringValue("payee_name")) == null) {
                        str5 = str6;
                    }
                    String stringValue2 = A0G.getStringValue("payout_record_product_subtype_name");
                    if (stringValue2 == null) {
                        stringValue2 = str6;
                    }
                    C04220Ms.A09(stringValue2);
                    TreeJNI treeValue5 = A0G.getTreeValue("payout_record_payout_amount", cls2);
                    if (!(treeValue5 == null || (A0k = C86154wM.A0k(treeValue5)) == null)) {
                        str6 = A0k;
                    }
                    AnonymousClass7E5.A01(new C121187Eo(C128097is.A00(new Object[]{str5, stringValue2, A01, str6}, 2131826310), C128097is.A00(new Object[0], 2131826326), num, 112, z2, false, false), A002, builder);
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            }
        }
    }
}
