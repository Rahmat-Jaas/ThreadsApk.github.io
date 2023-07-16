package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.impls.FBPayFormFieldImpl;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.form.fragment.model.FormParams;
import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.58V  reason: invalid class name */
public final class AnonymousClass58V extends C62793ak implements C146618mX {
    public static final C969667k A0M = C969667k.SELECT;
    public SparseArray A00;
    public AnonymousClass79R A01;
    public ECPPaymentRequest A02;
    public LoggingContext A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C880756q A0A;
    public final C880756q A0B;
    public final C880856r A0C;
    public final C880856r A0D;
    public final C880856r A0E;
    public final C880856r A0F;
    public final C880856r A0G;
    public final C880856r A0H;
    public final C143158gC A0I;
    public final C143158gC A0J;
    public final AnonymousClass587 A0K;
    public final C04530Oa A0L = AnonymousClass0OY.A02(AnonymousClass8GY.A00);

    public final AnonymousClass7Kx A0F() {
        C108806iy r0;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        AnonymousClass69Q r1;
        AnonymousClass69Q r02;
        PuxContactItem puxContactItem;
        String str3 = null;
        AnonymousClass69U r18 = AnonymousClass69U.A0V;
        AnonymousClass7Kx A092 = AnonymousClass7Kx.A09(new PuxContactItem(r18, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false));
        AnonymousClass7Kx A0R = C86104wH.A0R(this.A0A);
        if (A0R == null || (r0 = (C108806iy) A0R.A01) == null) {
            return A092;
        }
        C114946uB r03 = (C114946uB) r0.A01;
        String str4 = r03.A02;
        C115356uv r10 = r03.A00;
        String str5 = null;
        if (r10 != null) {
            str = r10.A02;
        } else {
            str = null;
        }
        C115306uq r9 = r03.A01;
        if (r9 != null) {
            str2 = r9.A01;
        } else {
            str2 = null;
        }
        if (!this.A08 || (str4 != null && !AnonymousClass8bQ.A0n(str4))) {
            z = false;
        } else {
            z = true;
        }
        if (!this.A07 || (str != null && !AnonymousClass8bQ.A0n(str))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.A09 || (str2 != null && !AnonymousClass8bQ.A0n(str2))) {
            z3 = false;
        } else {
            z3 = true;
        }
        Boolean[] boolArr = {Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)};
        int i = 0;
        int i2 = 0;
        do {
            if (boolArr[i].booleanValue()) {
                i2++;
            }
            i++;
        } while (i < 3);
        if (i2 == 1) {
            int i3 = 2131826416;
            if (A0C()) {
                i3 = 2131826422;
            }
            if (A0C()) {
                r02 = AnonymousClass69Q.A1A;
            } else {
                r02 = AnonymousClass69Q.A0T;
            }
            AnonymousClass88V r12 = new AnonymousClass88V(r02, i3);
            if (z) {
                puxContactItem = new PuxContactItem(r18, 5, (String) null, (String) null, (String) null, (String) null, (String) null, false);
            } else if (z2) {
                puxContactItem = new PuxContactItem(r18, 1, (String) null, (String) null, (String) null, (String) null, (String) null, false);
            } else {
                puxContactItem = new PuxContactItem(r18, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false);
            }
            return AnonymousClass7Kx.A0B(puxContactItem, r12);
        }
        if (!this.A08) {
            str4 = null;
        }
        if (!this.A07) {
            str = null;
        }
        if (!this.A09) {
            str2 = null;
        }
        List A17 = C06750aI.A17(str4, str, str2);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : A17) {
            String str6 = (String) next;
            if (str6 != null && !AnonymousClass8bQ.A0n(str6)) {
                A0v.add(next);
            }
        }
        if (!z && !z2 && !z3) {
            if (this.A07) {
                if (r10 != null) {
                    str3 = r10.A01;
                }
            } else if (this.A09) {
                if (r9 != null) {
                    str3 = r9.A02;
                }
            }
            str5 = String.valueOf(str3);
        }
        PuxContactItem puxContactItem2 = new PuxContactItem(r18, (Integer) null, (String) null, (String) AnonymousClass00J.A0G(A0v, 0), (String) AnonymousClass00J.A0G(A0v, 1), (String) AnonymousClass00J.A0G(A0v, 2), str5, false);
        if (!z && !z2 && !z3) {
            return AnonymousClass7Kx.A0A(puxContactItem2);
        }
        int i4 = 2131826416;
        if (A0C()) {
            i4 = 2131826422;
        }
        if (A0C()) {
            r1 = AnonymousClass69Q.A1A;
        } else {
            r1 = AnonymousClass69Q.A0T;
        }
        return AnonymousClass7Kx.A0B(puxContactItem2, new AnonymousClass88V(r1, i4));
    }

    public final void ACT(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r13) {
        String str;
        C114956uC r1;
        C115146ua r12;
        Object obj;
        AnonymousClass7Kx A0R;
        C108806iy r14;
        C114946uB r3;
        C114946uB r15;
        C114956uC r16;
        C115156ub r17;
        Object obj2;
        AnonymousClass7Kx A0R2;
        C108806iy r18;
        C114946uB r32;
        String str2 = null;
        AnonymousClass7Kx A0B2 = AnonymousClass7Kx.A0B((Object) null, C18210wN.A0W("Selected item not in the list"));
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) r13.A01;
        if (baseCheckoutItem != null && (baseCheckoutItem instanceof BaseSelectionCheckoutItem)) {
            int ordinal = baseCheckoutItem.AqR().ordinal();
            if (ordinal == 29) {
                SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) baseCheckoutItem;
                str = null;
                A07(AnonymousClass0wJ.A0d(selectionEmailViewItem.A04), "select_existing_email", false);
                AnonymousClass7Kx A0R3 = C86104wH.A0R(this.A0D);
                if (!(A0R3 == null || (r1 = (C114956uC) A0R3.A01) == null || (r12 = r1.A00) == null)) {
                    Iterator it = r12.A03.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C04220Ms.A0I(((C115356uv) obj).A02, selectionEmailViewItem.A01)) {
                            break;
                        }
                    }
                    C115356uv r5 = (C115356uv) obj;
                    if (!(r5 == null || (A0R = C86104wH.A0R(this.A0H)) == null || (r14 = (C108806iy) A0R.A01) == null || (r3 = (C114946uB) r14.A01) == null)) {
                        String id = ((BaseSelectionCheckoutItem) baseCheckoutItem).getId();
                        C115356uv r19 = r3.A00;
                        if (r19 != null) {
                            str2 = r19.A01;
                        }
                        if (!C04220Ms.A0I(id, str2)) {
                            r15 = new C114946uB(r5, r3.A01, r3.A02);
                        }
                    }
                }
            } else if (ordinal == 30) {
                SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) baseCheckoutItem;
                str = null;
                A07(AnonymousClass0wJ.A0d(selectionPhoneNumberViewItem.A04), "select_existing_phone", false);
                AnonymousClass7Kx A0R4 = C86104wH.A0R(this.A0D);
                if (!(A0R4 == null || (r16 = (C114956uC) A0R4.A01) == null || (r17 = r16.A02) == null)) {
                    Iterator it2 = r17.A03.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (C04220Ms.A0I(((C115306uq) obj2).A01, selectionPhoneNumberViewItem.A01)) {
                            break;
                        }
                    }
                    C115306uq r52 = (C115306uq) obj2;
                    if (!(r52 == null || (A0R2 = C86104wH.A0R(this.A0H)) == null || (r18 = (C108806iy) A0R2.A01) == null || (r32 = (C114946uB) r18.A01) == null)) {
                        String id2 = ((BaseSelectionCheckoutItem) baseCheckoutItem).getId();
                        C115306uq r110 = r32.A01;
                        if (r110 != null) {
                            str2 = r110.A02;
                        }
                        if (!C04220Ms.A0I(id2, str2)) {
                            r15 = new C114946uB(r32.A00, r52, r32.A02);
                        }
                    }
                }
            }
            A0B2 = AnonymousClass7Kx.A0A(new C108806iy(AnonymousClass006.A01, r15, str));
        }
        if (A0B2.A01 != null) {
            this.A0H.A0H(A0B2);
        }
        ((C147048nI) fragment).Brt();
    }

    public final void AJJ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r5) {
        C04220Ms.A0B(contextThemeWrapper, 2);
        BrQ(bundle, contextThemeWrapper, fragment, r5);
    }

    public final void BrQ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r15) {
        Integer AjU;
        FBPayFormFieldImpl fBPayFormFieldImpl;
        FormParams A012;
        FBPayFormFieldImpl fBPayFormFieldImpl2;
        FBPayFormFieldImpl fBPayFormFieldImpl3;
        FBPayFormFieldImpl fBPayFormFieldImpl4;
        FBPayFormFieldImpl fBPayFormFieldImpl5;
        FBPayFormFieldImpl fBPayFormFieldImpl6;
        C04220Ms.A0B(r15, 0);
        boolean A1Z = C18200wM.A1Z(contextThemeWrapper);
        BaseCheckoutItem baseCheckoutItem = (BaseCheckoutItem) r15.A01;
        if (baseCheckoutItem != null) {
            if (baseCheckoutItem instanceof SelectionNameViewItem) {
                A07((Long) null, "edit_name", A0B());
                C128217jA r5 = AnonymousClass6XQ.A00;
                int i = 2131826530;
                if (A0B()) {
                    i = 2131826529;
                }
                AnonymousClass7Kx A0R = C86104wH.A0R(this.A0F);
                if (A0R == null || (fBPayFormFieldImpl6 = (FBPayFormFieldImpl) A0R.A01) == null) {
                    throw C18180wK.A0a("Required value was null.");
                }
                A012 = r5.A01(fBPayFormFieldImpl6, ((SelectionNameViewItem) baseCheckoutItem).A01, i, A0B());
            } else if (baseCheckoutItem instanceof SelectionEmailViewItem) {
                SelectionEmailViewItem selectionEmailViewItem = (SelectionEmailViewItem) baseCheckoutItem;
                String str = selectionEmailViewItem.A04;
                A07(AnonymousClass0wJ.A0d(str), "edit_email", A0B());
                C128207j9 r4 = AnonymousClass6XP.A00;
                int i2 = 2131826528;
                if (A0B()) {
                    i2 = 2131826527;
                }
                AnonymousClass7Kx A0R2 = C86104wH.A0R(this.A0E);
                if (A0R2 == null || (fBPayFormFieldImpl5 = (FBPayFormFieldImpl) A0R2.A01) == null) {
                    throw C18180wK.A0a("Required value was null.");
                }
                A012 = r4.A01(fBPayFormFieldImpl5, 2131826536, str, selectionEmailViewItem.A01, i2, A0B());
            } else if (baseCheckoutItem instanceof SelectionPhoneNumberViewItem) {
                SelectionPhoneNumberViewItem selectionPhoneNumberViewItem = (SelectionPhoneNumberViewItem) baseCheckoutItem;
                String str2 = selectionPhoneNumberViewItem.A04;
                A07(AnonymousClass0wJ.A0d(str2), "edit_phone", A0B());
                C128227jB r42 = AnonymousClass6XR.A00;
                AnonymousClass7Kx A0R3 = C86104wH.A0R(this.A0G);
                if (A0R3 == null || (fBPayFormFieldImpl4 = (FBPayFormFieldImpl) A0R3.A01) == null) {
                    throw C18180wK.A0a("Required value was null.");
                }
                A012 = r42.A01(fBPayFormFieldImpl4, 2131826539, str2, selectionPhoneNumberViewItem.A01, 2131826531, A0B());
            } else if ((baseCheckoutItem instanceof C143528gt) && (AjU = ((C143528gt) baseCheckoutItem).AjU()) != null) {
                int intValue = AjU.intValue();
                if (intValue == 0) {
                    A09("add_phone");
                    C128227jB r3 = AnonymousClass6XR.A00;
                    AnonymousClass7Kx A0R4 = C86104wH.A0R(this.A0G);
                    if (A0R4 == null || (fBPayFormFieldImpl = (FBPayFormFieldImpl) A0R4.A01) == null) {
                        throw C18180wK.A0a("Required value was null.");
                    }
                    A012 = r3.A01(fBPayFormFieldImpl, (Integer) null, (String) null, (String) null, 2131826521, A0B());
                } else if (intValue == A1Z) {
                    A09("add_email");
                    C128207j9 r32 = AnonymousClass6XP.A00;
                    int i3 = 2131826518;
                    if (A0B()) {
                        i3 = 2131826517;
                    }
                    AnonymousClass7Kx A0R5 = C86104wH.A0R(this.A0E);
                    if (A0R5 == null || (fBPayFormFieldImpl2 = (FBPayFormFieldImpl) A0R5.A01) == null) {
                        throw C18180wK.A0a("Required value was null.");
                    }
                    A012 = r32.A01(fBPayFormFieldImpl2, (Integer) null, (String) null, (String) null, i3, A0B());
                } else if (intValue == 5) {
                    A09("add_name");
                    C128217jA r43 = AnonymousClass6XQ.A00;
                    int i4 = 2131826520;
                    if (A0B()) {
                        i4 = 2131826519;
                    }
                    AnonymousClass7Kx A0R6 = C86104wH.A0R(this.A0F);
                    if (A0R6 == null || (fBPayFormFieldImpl3 = (FBPayFormFieldImpl) A0R6.A01) == null) {
                        throw C18180wK.A0a("Required value was null.");
                    }
                    A012 = r43.A01(fBPayFormFieldImpl3, (String) null, i4, A0B());
                } else {
                    return;
                }
            } else {
                return;
            }
            bundle.putParcelable("ECP_FORM_FRAGMENT_PARAMS", A012);
            AnonymousClass7H3.A01(bundle, fragment, "content_form_fragment", true, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r4.A00.A03.isEmpty() == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r4.A02.A03.isEmpty() == false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.C114956uC r40, X.AnonymousClass58V r41) {
        /*
            r2 = r41
            boolean r0 = r2.A0C()
            r4 = r40
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            if (r0 == 0) goto L_0x028b
            if (r40 == 0) goto L_0x02d3
            boolean r0 = r2.A08
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0272
            X.6tj r0 = r4.A01
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0022
            boolean r0 = X.AnonymousClass8bQ.A0n(r0)
            if (r0 == 0) goto L_0x0272
        L_0x0022:
            r15 = 1
        L_0x0023:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0033
            X.6ua r0 = r4.A00
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            r20 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            r20 = 0
        L_0x0035:
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0045
            X.6ub r0 = r4.A02
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            r19 = 1
            if (r0 != 0) goto L_0x0047
        L_0x0045:
            r19 = 0
        L_0x0047:
            boolean r0 = r2.A08
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.A07
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8 = 2
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r7, r1, r0}
            java.util.List r1 = X.C06750aI.A17(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x023a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x023a
            r7 = 0
        L_0x006d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r20)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r9, r1, r0}
            java.util.List r1 = X.C06750aI.A17(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0254
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0254
            r10 = 0
        L_0x008c:
            X.587 r1 = r2.A0K
            X.69P r0 = X.AnonymousClass69P.CONTACT_INFORMATION
            X.67P r1 = r1.A01(r0)
            X.67P r0 = X.AnonymousClass67P.OTC
            boolean r13 = X.C18180wK.A1Z(r1, r0)
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            r11 = 0
            r1 = 0
            r0 = 2131826423(0x7f1116f7, float:1.928573E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            if (r10 != 0) goto L_0x0236
            java.lang.Integer r0 = X.AnonymousClass006.A0C
        L_0x00ab:
            X.AnonymousClass7Kx.A0M(r12, r0, r3)
            boolean r0 = r2.A08
            java.lang.String r18 = "Required value was null."
            if (r0 == 0) goto L_0x00db
            X.6tj r0 = r4.A01
            if (r15 == 0) goto L_0x0231
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r0.A00
            java.lang.String r11 = X.C86154wM.A0j(r0)
            android.util.SparseArray r0 = r2.A00
            java.lang.String r12 = X.C86144wL.A0p(r0, r8)
            X.56r r0 = r2.A0F
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0286
            java.lang.Object r8 = r0.A01
            com.facebook.graphql.impls.FBPayFormFieldImpl r8 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r8
            if (r8 == 0) goto L_0x0286
            java.lang.String r0 = "add_name"
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128217jA.A00(r8, r12, r0, r5, r5)
            r9.add(r0)
        L_0x00db:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0106
            X.6ua r8 = r4.A00
            if (r20 == 0) goto L_0x022a
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r8.A00
            java.lang.String r11 = X.C86154wM.A0j(r0)
            android.util.SparseArray r0 = r2.A00
            java.lang.String r12 = X.C86144wL.A0p(r0, r5)
            X.56r r0 = r2.A0E
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x0281
            java.lang.Object r8 = r0.A01
            com.facebook.graphql.impls.FBPayFormFieldImpl r8 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r8
            if (r8 == 0) goto L_0x0281
            java.lang.String r0 = "add_email"
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128207j9.A00(r8, r12, r0, r5, r5)
            r9.add(r0)
        L_0x0106:
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0131
            if (r19 == 0) goto L_0x0221
            X.6ub r0 = r4.A02
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r0.A00
            java.lang.String r11 = X.C86154wM.A0j(r0)
            android.util.SparseArray r0 = r2.A00
            java.lang.String r8 = X.C86144wL.A0p(r0, r6)
            X.56r r0 = r2.A0G
            X.7Kx r0 = X.C86104wH.A0R(r0)
            if (r0 == 0) goto L_0x027c
            java.lang.Object r4 = r0.A01
            com.facebook.graphql.impls.FBPayFormFieldImpl r4 = (com.facebook.graphql.impls.FBPayFormFieldImpl) r4
            if (r4 == 0) goto L_0x027c
            java.lang.String r0 = "add_phone"
            com.facebookpay.form.cell.text.TextCellParams r0 = X.C128227jB.A00(r4, r8, r0, r5, r5)
            r9.add(r0)
        L_0x0131:
            if (r10 == 0) goto L_0x0275
            if (r7 <= r5) goto L_0x013a
            if (r10 != r5) goto L_0x013a
            A0A(r11, r3)
        L_0x013a:
            boolean r4 = r2.A0B()
            com.facebookpay.form.fragment.model.FeatureConfiguration r17 = new com.facebookpay.form.fragment.model.FeatureConfiguration
            r0 = r17
            r0.<init>(r4, r5)
            r16 = 2131826524(0x7f11175c, float:1.9285935E38)
            java.util.ArrayList r11 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            java.lang.String r12 = "client_add_contact_fail"
            java.lang.String r13 = "client_add_contact_success"
            java.lang.String r14 = "user_add_contact_submit"
            if (r15 == 0) goto L_0x0184
            java.lang.String r15 = "client_load_contact_success"
            java.lang.String r4 = "add_name_inline"
            com.facebookpay.form.fragment.model.FormDisplayEvent r0 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r0.<init>(r15, r4, r1)
            r11.add(r0)
            com.facebookpay.form.fragment.model.FormClickEvent r0 = new com.facebookpay.form.fragment.model.FormClickEvent
            r0.<init>(r14, r4)
            r10.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r13, r4)
            r8.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r12, r4)
            r7.add(r0)
        L_0x0184:
            if (r20 == 0) goto L_0x01aa
            java.lang.String r15 = "client_load_contact_success"
            java.lang.String r4 = "add_email_inline"
            com.facebookpay.form.fragment.model.FormDisplayEvent r0 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r0.<init>(r15, r4, r1)
            r11.add(r0)
            com.facebookpay.form.fragment.model.FormClickEvent r0 = new com.facebookpay.form.fragment.model.FormClickEvent
            r0.<init>(r14, r4)
            r10.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r13, r4)
            r8.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r12, r4)
            r7.add(r0)
        L_0x01aa:
            if (r19 == 0) goto L_0x01d0
            java.lang.String r15 = "client_load_contact_success"
            java.lang.String r4 = "add_phone_inline"
            com.facebookpay.form.fragment.model.FormDisplayEvent r0 = new com.facebookpay.form.fragment.model.FormDisplayEvent
            r0.<init>(r15, r4, r1)
            r11.add(r0)
            com.facebookpay.form.fragment.model.FormClickEvent r0 = new com.facebookpay.form.fragment.model.FormClickEvent
            r0.<init>(r14, r4)
            r10.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r13, r4)
            r8.add(r0)
            com.facebookpay.form.fragment.model.FormMutationEvent r0 = new com.facebookpay.form.fragment.model.FormMutationEvent
            r0.<init>(r12, r4)
            r7.add(r0)
        L_0x01d0:
            com.facebookpay.form.fragment.model.FormLoggingEvents r22 = new com.facebookpay.form.fragment.model.FormLoggingEvents
            r23 = r1
            r24 = r1
            r25 = r1
            r26 = r1
            r27 = r1
            r28 = r11
            r29 = r10
            r30 = r8
            r31 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0 = 2131826454(0x7f111716, float:1.9285793E38)
            com.facebookpay.form.cell.label.LabelCellParams r20 = X.AnonymousClass7BI.A02(r0, r6, r6, r6)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r16)
            com.facebookpay.form.fragment.model.FormParams r4 = new com.facebookpay.form.fragment.model.FormParams
            r28 = r1
            r29 = r1
            r30 = r1
            r31 = r9
            r32 = r1
            r33 = r1
            r34 = r5
            r35 = r6
            r36 = r6
            r37 = r6
            r38 = r6
            r39 = r6
            r40 = r6
            r41 = r6
            r19 = r4
            r21 = r17
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r2 = r2.A02
            java.lang.String r0 = "ecpPaymentRequest"
            if (r2 != 0) goto L_0x02bd
            X.C04220Ms.A0E(r0)
            throw r1
        L_0x0221:
            X.6ub r4 = r4.A02
            r0 = r13 ^ 1
            r2.A04(r4, r3, r0, r0)
            goto L_0x0131
        L_0x022a:
            r0 = r13 ^ 1
            r2.A02(r8, r3, r0, r0)
            goto L_0x0106
        L_0x0231:
            r2.A03(r0, r3)
            goto L_0x00db
        L_0x0236:
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            goto L_0x00ab
        L_0x023a:
            java.util.Iterator r1 = r1.iterator()
            r7 = 0
        L_0x023f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r0 = r1.next()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x023f
            int r7 = r7 + 1
            if (r7 >= 0) goto L_0x023f
            goto L_0x026d
        L_0x0254:
            java.util.Iterator r1 = r1.iterator()
            r10 = 0
        L_0x0259:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0259
            int r10 = r10 + 1
            if (r10 >= 0) goto L_0x0259
        L_0x026d:
            X.C06750aI.A19()
            r0 = 0
            throw r0
        L_0x0272:
            r15 = 0
            goto L_0x0023
        L_0x0275:
            android.util.SparseArray r0 = X.C86154wM.A0D()
            r2.A00 = r0
            goto L_0x02d3
        L_0x027c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        L_0x0281:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        L_0x0286:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        L_0x028b:
            boolean r0 = r2.A0B()
            if (r0 == 0) goto L_0x029d
            r0 = 2131826423(0x7f1116f7, float:1.928573E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            X.AnonymousClass7Kx.A0M(r1, r0, r3)
        L_0x029d:
            if (r40 == 0) goto L_0x02d3
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x02a8
            X.6tj r0 = r4.A01
            r2.A03(r0, r3)
        L_0x02a8:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x02b2
            X.6ua r1 = r4.A00
            r0 = 1
            r2.A02(r1, r3, r0, r0)
        L_0x02b2:
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x02d3
            X.6ub r1 = r4.A02
            r0 = 1
            r2.A04(r1, r3, r0, r0)
            goto L_0x02d3
        L_0x02bd:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r2.A05
            if (r0 == 0) goto L_0x02d8
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x02c9
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x02d8
        L_0x02c9:
            X.69U r1 = X.AnonymousClass69U.A03
            com.facebookpay.common.recyclerview.adapteritems.InlineFormItem r0 = new com.facebookpay.common.recyclerview.adapteritems.InlineFormItem
            r0.<init>(r1, r4, r2)
            X.AnonymousClass7Kx.A0N(r0, r3)
        L_0x02d3:
            java.util.List r0 = X.AnonymousClass00J.A0N(r3)
            return r0
        L_0x02d8:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58V.A00(X.6uC, X.58V):java.util.List");
    }

    public static final void A01(BaseSelectionCheckoutItem baseSelectionCheckoutItem, AnonymousClass58V r7) {
        C108806iy r0;
        C114946uB r4;
        Integer num;
        C969667k r02 = (C969667k) r7.A0C.A08();
        if (r02 != null) {
            if (r02.ordinal() == 1) {
                num = AnonymousClass006.A01;
            } else {
                AnonymousClass7Kx A0R = C86104wH.A0R(r7.A0H);
                if (A0R != null && (r0 = (C108806iy) A0R.A01) != null && (r4 = (C114946uB) r0.A01) != null) {
                    AnonymousClass69U AqR = baseSelectionCheckoutItem.AqR();
                    int ordinal = AqR.ordinal();
                    String str = null;
                    if (ordinal == 29) {
                        C115356uv r03 = r4.A00;
                        if (r03 != null) {
                            str = r03.A01;
                        }
                    } else if (ordinal == 30) {
                        C115306uq r04 = r4.A01;
                        if (r04 != null) {
                            str = r04.A02;
                        }
                    } else if (ordinal == 28) {
                        num = AnonymousClass006.A00;
                    } else {
                        throw C18180wK.A0a(AnonymousClass0wJ.A0t("Invalid contact item type: ", AqR));
                    }
                    AnonymousClass6I2.A00(baseSelectionCheckoutItem, str);
                    return;
                }
                return;
            }
            baseSelectionCheckoutItem.Cpe(num);
        }
    }

    private final void A02(C115146ua r13, List list, boolean z, boolean z2) {
        if (r13 != null) {
            String A0j = C86154wM.A0j(r13.A00);
            A0A(A0j, list);
            List<C115356uv> list2 = r13.A03;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (C115356uv r0 : list2) {
                String str = r0.A02;
                if (str != null) {
                    String str2 = r0.A01;
                    if (str2 != null) {
                        boolean z3 = r0.A04;
                        SelectionEmailViewItem selectionEmailViewItem = new SelectionEmailViewItem(AnonymousClass69U.A0h, AnonymousClass006.A0N, str2, str, A0j, r0.A00, z2, z3);
                        A01(selectionEmailViewItem, this);
                        AnonymousClass7Kx.A0N(selectionEmailViewItem, A0v);
                    } else {
                        throw AnonymousClass0wJ.A0b();
                    }
                }
            }
            list.addAll(A0v);
            if (z) {
                int i = 2131826373;
                if (A0B()) {
                    i = 2131826374;
                }
                list.add(AnonymousClass7Kx.A0A(new SelectionActionViewItem(AnonymousClass69U.A0g, 1, Integer.valueOf(i), A0j, (String) null)));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(X.C114686tj r12, java.util.List r13) {
        /*
            r11 = this;
            com.facebook.graphql.impls.FBPayFormFieldImpl r0 = r12.A00
            java.lang.String r4 = X.C86154wM.A0j(r0)
            A0A(r4, r13)
            java.lang.String r9 = r12.A01
            if (r9 == 0) goto L_0x0028
            boolean r0 = X.AnonymousClass8bQ.A0n(r9)
            if (r0 != 0) goto L_0x0028
            X.69U r6 = X.AnonymousClass69U.A0j
            java.lang.Integer r7 = X.AnonymousClass006.A00
            java.lang.String r8 = ""
            com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem r0 = new com.facebookpay.common.recyclerview.adapteritems.SelectionNameViewItem
            r5 = r0
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0020:
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            r13.add(r0)
            return
        L_0x0028:
            r1 = 2131826375(0x7f1116c7, float:1.9285633E38)
            r5 = 0
            r0 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            X.69U r1 = X.AnonymousClass69U.A0g
            com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem r0 = new com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58V.A03(X.6tj, java.util.List):void");
    }

    private final void A04(C115156ub r13, List list, boolean z, boolean z2) {
        SelectionPhoneNumberViewItem selectionPhoneNumberViewItem;
        if (r13 != null) {
            String A0j = C86154wM.A0j(r13.A00);
            A0A(A0j, list);
            List<C115306uq> list2 = r13.A03;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (C115306uq r0 : list2) {
                String str = r0.A01;
                if (str != null) {
                    String str2 = r0.A02;
                    if (str2 != null) {
                        boolean z3 = r0.A05;
                        selectionPhoneNumberViewItem = new SelectionPhoneNumberViewItem(AnonymousClass69U.A0l, AnonymousClass006.A0N, str2, str, A0j, r0.A00, z2, z3);
                        A01(selectionPhoneNumberViewItem, this);
                    } else {
                        throw AnonymousClass0wJ.A0b();
                    }
                } else {
                    selectionPhoneNumberViewItem = null;
                }
                AnonymousClass7Kx.A0N(selectionPhoneNumberViewItem, A0v);
            }
            list.addAll(A0v);
            if (z) {
                int i = 2131826376;
                if (A0B()) {
                    i = 2131826557;
                }
                list.add(AnonymousClass7Kx.A0A(new SelectionActionViewItem(AnonymousClass69U.A0g, C18220wO.A0d(), Integer.valueOf(i), A0j, (String) null)));
            }
        }
    }

    public static final void A05(AnonymousClass58V r5) {
        Iterable<AnonymousClass7Kx> iterable;
        C880756q r4 = r5.A0B;
        AnonymousClass7Kx A0R = C86104wH.A0R(r4);
        if (A0R != null && (iterable = (Iterable) A0R.A01) != null) {
            ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
            for (AnonymousClass7Kx A072 : iterable) {
                A0w.add(AnonymousClass7Kx.A07(A072, r5, 9));
            }
            Object A082 = r4.A08();
            if (A082 != null) {
                r4.A0H(AnonymousClass7Kx.A06((AnonymousClass7Kx) A082, A0w, 8));
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r6 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e3, code lost:
        if (r11 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0136, code lost:
        if (r7 != null) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x013d, code lost:
        if (r6 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0144, code lost:
        if (r8 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0149, code lost:
        if (r8 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x014e, code lost:
        if (r8 != null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass58V r13, X.AnonymousClass7Kx r14) {
        /*
            X.56r r4 = r13.A0D
            r4.A0H(r14)
            java.lang.String r2 = r13.A04
            java.lang.String r12 = "Required value was null."
            r0 = 0
            if (r2 == 0) goto L_0x001a
            java.lang.Object r1 = r14.A01
            if (r1 == 0) goto L_0x01ce
            X.6uC r1 = (X.C114956uC) r1
            boolean r1 = r13.A0D(r1, r2)
            if (r1 == 0) goto L_0x001a
            r13.A04 = r0
        L_0x001a:
            java.lang.String r2 = r13.A05
            if (r2 == 0) goto L_0x002c
            java.lang.Object r1 = r14.A01
            if (r1 == 0) goto L_0x01c9
            X.6uC r1 = (X.C114956uC) r1
            boolean r1 = r13.A0E(r1, r2)
            if (r1 == 0) goto L_0x002c
            r13.A05 = r0
        L_0x002c:
            boolean r1 = X.AnonymousClass7Kx.A0R(r14)
            if (r1 == 0) goto L_0x018a
            X.56r r2 = r13.A0F
            X.7Sc r1 = X.AnonymousClass7Sc.A00
            X.AnonymousClass7Kx.A0E(r1, r2, r14)
            X.56r r2 = r13.A0E
            X.7Sd r1 = X.C122457Sd.A00
            X.AnonymousClass7Kx.A0E(r1, r2, r14)
            X.56r r2 = r13.A0G
            X.7Se r1 = X.AnonymousClass7Se.A00
            X.AnonymousClass7Kx.A0E(r1, r2, r14)
            java.lang.Object r9 = r14.A01
            r8 = r9
            X.6uC r8 = (X.C114956uC) r8
            if (r8 == 0) goto L_0x0143
            X.6ua r1 = r8.A00
            if (r1 == 0) goto L_0x0143
            java.lang.String r3 = r1.A02
        L_0x0054:
            X.6ua r1 = r8.A00
            if (r1 == 0) goto L_0x0148
            X.6tk r11 = r1.A01
        L_0x005a:
            X.6ub r1 = r8.A02
            if (r1 == 0) goto L_0x014d
            java.lang.String r7 = r1.A02
        L_0x0060:
            X.6ub r1 = r8.A02
            if (r1 == 0) goto L_0x0152
            X.6tk r6 = r1.A01
        L_0x0066:
            X.56q r2 = r13.A0B
            java.util.List r1 = A00(r8, r13)
            X.AnonymousClass7Kx.A0I(r2, r1)
            if (r3 != 0) goto L_0x00de
            if (r11 != 0) goto L_0x00e5
            if (r7 != 0) goto L_0x0138
            if (r6 == 0) goto L_0x01b6
        L_0x0077:
            X.56r r5 = r13.A0H
            X.7Kx r1 = X.C86104wH.A0R(r5)
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r1 = r1.A01
            X.6uB r1 = (X.C114946uB) r1
            if (r1 == 0) goto L_0x00dc
            X.6uq r1 = r1.A01
            if (r1 == 0) goto L_0x00dc
            java.lang.String r2 = r1.A02
        L_0x0091:
            java.lang.String r1 = r6.A01
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x00ca
            if (r9 == 0) goto L_0x0171
            X.6ub r1 = r8.A02
            java.util.List r1 = r1.A03
            java.util.Iterator r4 = r1.iterator()
        L_0x00a3:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x016c
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.6uq r1 = (X.C115306uq) r1
            if (r1 == 0) goto L_0x00da
            java.lang.String r2 = r1.A02
        L_0x00b4:
            java.lang.String r1 = r6.A00
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x00a3
            if (r3 == 0) goto L_0x016c
            X.7Kx r2 = X.C86104wH.A0R(r5)
            r1 = 5
            X.7Kx r1 = X.AnonymousClass7Kx.A06(r2, r3, r1)
            r5.A0H(r1)
        L_0x00ca:
            X.0Oa r1 = r13.A0L
            X.7j5 r3 = X.C86144wL.A0R(r1)
            java.lang.String r2 = r13.A06
            if (r2 != 0) goto L_0x0155
            java.lang.String r1 = "productID"
            X.C04220Ms.A0E(r1)
            throw r0
        L_0x00da:
            r2 = r0
            goto L_0x00b4
        L_0x00dc:
            r2 = r0
            goto L_0x0091
        L_0x00de:
            if (r9 == 0) goto L_0x0185
            r13.A0D(r8, r3)
            if (r11 == 0) goto L_0x0136
        L_0x00e5:
            X.56r r5 = r13.A0H
            X.7Kx r1 = X.C86104wH.A0R(r5)
            if (r1 == 0) goto L_0x0141
            java.lang.Object r1 = r1.A01
            X.6iy r1 = (X.C108806iy) r1
            if (r1 == 0) goto L_0x0141
            java.lang.Object r1 = r1.A01
            X.6uB r1 = (X.C114946uB) r1
            if (r1 == 0) goto L_0x0141
            X.6uv r1 = r1.A00
            if (r1 == 0) goto L_0x0141
            java.lang.String r2 = r1.A01
        L_0x00ff:
            java.lang.String r1 = r11.A01
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x0136
            if (r9 == 0) goto L_0x0180
            X.6ua r1 = r8.A00
            java.util.List r1 = r1.A03
            java.util.Iterator r10 = r1.iterator()
        L_0x0111:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x017b
            java.lang.Object r4 = r10.next()
            r3 = r4
            X.6uv r3 = (X.C115356uv) r3
            java.lang.String r2 = r3.A01
            java.lang.String r1 = r11.A00
            boolean r1 = X.C04220Ms.A0I(r2, r1)
            if (r1 == 0) goto L_0x0111
            if (r4 == 0) goto L_0x017b
            X.7Kx r2 = X.C86104wH.A0R(r5)
            r1 = 4
            X.7Kx r1 = X.AnonymousClass7Kx.A06(r2, r3, r1)
            r5.A0H(r1)
        L_0x0136:
            if (r7 == 0) goto L_0x013d
        L_0x0138:
            if (r9 == 0) goto L_0x0176
            r13.A0E(r8, r7)
        L_0x013d:
            if (r6 == 0) goto L_0x00ca
            goto L_0x0077
        L_0x0141:
            r2 = r0
            goto L_0x00ff
        L_0x0143:
            r3 = r0
            if (r8 == 0) goto L_0x0148
            goto L_0x0054
        L_0x0148:
            r11 = r0
            if (r8 == 0) goto L_0x014d
            goto L_0x005a
        L_0x014d:
            r7 = r0
            if (r8 == 0) goto L_0x0152
            goto L_0x0060
        L_0x0152:
            r6 = r0
            goto L_0x0066
        L_0x0155:
            X.587 r1 = r13.A0K
            X.69P r0 = X.AnonymousClass69P.CONTACT_INFORMATION
            X.79R r0 = X.AnonymousClass79R.A00(r0, r1, r2)
            X.56q r2 = X.AnonymousClass7IT.A01(r3, r0)
            X.7Kx r1 = X.C86104wH.A0R(r2)
            X.7SV r0 = X.AnonymousClass7SV.A00
            X.7Kx r0 = X.AnonymousClass7Kx.A03(r0, r1)
            goto L_0x01bc
        L_0x016c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r12)
            throw r0
        L_0x0171:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r12)
            throw r0
        L_0x0176:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r12)
            throw r0
        L_0x017b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r12)
            throw r0
        L_0x0180:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r12)
            throw r0
        L_0x0185:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r12)
            throw r0
        L_0x018a:
            boolean r1 = X.AnonymousClass7Kx.A0O(r14)
            if (r1 == 0) goto L_0x01c2
            X.56r r2 = r13.A0H
            java.lang.Throwable r3 = r14.A02
            X.7Kx r1 = X.C86104wH.A0R(r2)
            if (r1 == 0) goto L_0x01c0
            java.lang.Object r1 = r1.A01
        L_0x019c:
            X.AnonymousClass7Kx.A0K(r2, r1, r3)
            X.56q r2 = r13.A0B
            X.7Kx r1 = X.C86104wH.A0R(r4)
            if (r1 == 0) goto L_0x01ab
            java.lang.Object r0 = r1.A01
            X.6uC r0 = (X.C114956uC) r0
        L_0x01ab:
            java.util.List r0 = A00(r0, r13)
            X.7Kx r0 = X.AnonymousClass7Kx.A0B(r0, r3)
        L_0x01b3:
            r2.A0H(r0)
        L_0x01b6:
            X.56r r2 = r13.A0H
            java.lang.Object r0 = r2.A08()
        L_0x01bc:
            r2.A0H(r0)
            return
        L_0x01c0:
            r1 = r0
            goto L_0x019c
        L_0x01c2:
            X.56q r2 = r13.A0B
            X.7Kx r0 = X.AnonymousClass7Kx.A09(r0)
            goto L_0x01b3
        L_0x01c9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r12)
            throw r0
        L_0x01ce:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58V.A06(X.58V, X.7Kx):void");
    }

    private final void A07(Long l, String str, boolean z) {
        String str2;
        Map map;
        if (this.A0C.A08() == C969667k.EDIT || z) {
            str2 = "user_edit_contact_enter";
        } else {
            str2 = "user_click_contact_atomic";
        }
        C128957ke A012 = AnonymousClass7JJ.A01();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        AnonymousClass7DP A032 = this.A0K.A03();
        LinkedHashMap A0y = C18220wO.A0y();
        C86114wI.A1K(loggingContext, str, A0y);
        if (l != null) {
            A0y.put("component_data_id", Long.valueOf(l.longValue()));
        }
        Object obj = A0y.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
            map = C18220wO.A0y();
        }
        A012.Bb8(str2, AnonymousClass7Kr.A04(A032, A0y, map));
    }

    public static final void A0A(String str, List list) {
        if (str != null) {
            list.add(AnonymousClass7Kx.A0A(new SelectionHeaderItem(AnonymousClass69U.A0i, (Integer) null, AnonymousClass006.A01, str)));
        }
    }

    private final boolean A0B() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            C04220Ms.A0E("ecpPaymentRequest");
            throw null;
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return C18190wL.A1Z(checkoutConfiguration.A05, true);
        }
        return false;
    }

    private final boolean A0C() {
        ECPPaymentRequest eCPPaymentRequest = this.A02;
        if (eCPPaymentRequest == null) {
            C04220Ms.A0E("ecpPaymentRequest");
            throw null;
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return C18190wL.A1Z(checkoutConfiguration.A06, true);
        }
        return false;
    }

    private final boolean A0D(C114956uC r5, String str) {
        for (Object next : r5.A00.A03) {
            if (C04220Ms.A0I(((C115356uv) next).A01, str)) {
                if (next == null) {
                    return false;
                }
                C880856r r2 = this.A0H;
                r2.A0H(AnonymousClass7Kx.A06(C86104wH.A0R(r2), next, 6));
                return true;
            }
        }
        return false;
    }

    private final boolean A0E(C114956uC r5, String str) {
        for (Object next : r5.A02.A03) {
            if (C04220Ms.A0I(((C115306uq) next).A02, str)) {
                if (next == null) {
                    return false;
                }
                C880856r r2 = this.A0H;
                r2.A0H(AnonymousClass7Kx.A06(C86104wH.A0R(r2), next, 7));
                return true;
            }
        }
        return false;
    }

    public final boolean A0G(String str) {
        AnonymousClass79R A002 = AnonymousClass79R.A00(AnonymousClass69P.CONTACT_INFORMATION, this.A0K, str);
        if ((!this.A08 || C86144wL.A0R(this.A0L).A0B(A002)) && ((!this.A07 || C86144wL.A0R(this.A0L).A0A(A002)) && (!this.A09 || C86144wL.A0R(this.A0L).A0C(A002)))) {
            return false;
        }
        return true;
    }

    public final M5J Abc() {
        return this.A0C;
    }

    public final void CeZ() {
        C880856r r2 = this.A0C;
        if (r2.A08() != C969667k.NONE) {
            r2.A0H(A0M);
            A05(this);
        }
    }

    public final M5J Cgs() {
        return this.A0B;
    }

    public final boolean Cs9() {
        List<Object> A17 = C06750aI.A17(Boolean.valueOf(this.A08), Boolean.valueOf(this.A07), Boolean.valueOf(this.A09));
        if (!(A17 instanceof Collection) || !A17.isEmpty()) {
            int i = 0;
            for (Object A1X : A17) {
                if (AnonymousClass0wJ.A1X(A1X) && (i = i + 1) < 0) {
                    C06750aI.A19();
                    throw null;
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public final void Cwt() {
        C880856r r3 = this.A0C;
        C969667k r2 = (C969667k) r3.A08();
        if (r2 != null) {
            int ordinal = r2.ordinal();
            if (ordinal == 1) {
                r2 = C969667k.SELECT;
            } else if (ordinal == 2) {
                r2 = C969667k.EDIT;
            }
            r3.A0H(r2);
        }
        A05(this);
    }

    public final void D9D(SparseArray sparseArray) {
        if (sparseArray != null) {
            this.A00 = sparseArray;
        }
    }

    public AnonymousClass58V(AnonymousClass587 r6) {
        this.A0K = r6;
        C880756q A012 = C880756q.A01();
        this.A0B = A012;
        C880856r A032 = C880856r.A03();
        AnonymousClass7Kx.A0J(A032, (Object) null);
        this.A0D = A032;
        C880856r A042 = C880856r.A04(AnonymousClass7Kx.A09((Object) null));
        this.A0H = A042;
        this.A0C = C880856r.A04(A0M);
        C880756q A013 = C880756q.A01();
        AnonymousClass7Kx.A0J(A013, (Object) null);
        this.A0A = A013;
        this.A0F = C880856r.A03();
        this.A0E = C880856r.A03();
        this.A0G = C880856r.A03();
        this.A0I = C86114wI.A0Q(this, 23);
        IDxObserverShape211S0100000_2_I2 A0Q = C86114wI.A0Q(this, 24);
        this.A0J = A0Q;
        this.A00 = C86154wM.A0D();
        A013.A0K(A042, A0Q);
        A012.A0K(A042, A0Q);
    }

    private final void A09(String str) {
        Map map;
        C128957ke A012 = AnonymousClass7JJ.A01();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        AnonymousClass7DP A032 = this.A0K.A03();
        LinkedHashMap A0y = C18220wO.A0y();
        C86114wI.A1K(loggingContext, str, A0y);
        Object obj = A0y.get("extra_data");
        if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
            map = C18220wO.A0y();
        }
        A012.Bb8("user_add_contact_enter", AnonymousClass7Kr.A04(A032, A0y, map));
    }
}
