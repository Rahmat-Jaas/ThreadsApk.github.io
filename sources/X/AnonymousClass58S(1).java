package X;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentPickupOptionItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentShippingOptionItem;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent;
import com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent;
import com.fbpay.logging.LoggingContext;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.KtLambdaShape1S2200000_I2;

/* renamed from: X.58S  reason: invalid class name */
public final class AnonymousClass58S extends C62793ak implements C146618mX {
    public LoggingContext A00;
    public Integer A01;
    public Integer A02;
    public boolean A03;
    public boolean A04;
    public final C880756q A05;
    public final C880856r A06;
    public final C880856r A07 = C880856r.A04(AnonymousClass7Kx.A0A(AnonymousClass0ZV.A00));
    public final C880856r A08;
    public final C880856r A09;
    public final AnonymousClass587 A0A;
    public final C880856r A0B;
    public final C143158gC A0C;
    public final C143158gC A0D;

    public final void AJJ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r4) {
    }

    public final void BrQ(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r4) {
    }

    public final void CeZ() {
    }

    public final void Cwt() {
    }

    public final void D9D(SparseArray sparseArray) {
    }

    public static final String A00(AnonymousClass58S r0) {
        C108806iy r02;
        FulfillmentOptionComponent fulfillmentOptionComponent;
        AnonymousClass7Kx A0R = C86104wH.A0R(r0.A05);
        if (A0R == null || (r02 = (C108806iy) A0R.A01) == null || (fulfillmentOptionComponent = (FulfillmentOptionComponent) r02.A01) == null) {
            return null;
        }
        return fulfillmentOptionComponent.A02();
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem] */
    /* JADX WARNING: type inference failed for: r7v3, types: [com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r7v4, types: [com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentShippingOptionItem] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass58S r17, java.util.List r18) {
        /*
            r1 = r17
            if (r18 != 0) goto L_0x0045
            X.56r r5 = r1.A07
            X.7Kx r0 = X.C86104wH.A0R(r5)
            if (r0 == 0) goto L_0x011f
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x011f
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r3.next()
            X.7Kx r2 = (X.AnonymousClass7Kx) r2
            r0 = 22
            X.7Kx r0 = X.AnonymousClass7Kx.A07(r2, r1, r0)
            r4.add(r0)
            goto L_0x001a
        L_0x0030:
            java.lang.Object r1 = r5.A08()
            if (r1 == 0) goto L_0x0040
            X.7Kx r1 = (X.AnonymousClass7Kx) r1
            r0 = 21
            X.7Kx r0 = X.AnonymousClass7Kx.A06(r1, r4, r0)
            goto L_0x011c
        L_0x0040:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x0045:
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0067
            java.lang.Integer r3 = r1.A01
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r3 != r0) goto L_0x00fc
            r5 = 0
            r0 = 2131826438(0x7f111706, float:1.928576E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r3 = X.AnonymousClass006.A0N
            X.69U r0 = X.AnonymousClass69U.A0i
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            r6.<init>(r0, r4, r3, r5)
        L_0x0064:
            X.AnonymousClass7Kx.A0N(r6, r2)
        L_0x0067:
            java.util.Iterator r5 = r18.iterator()
        L_0x006b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r0 = r5.next()
            com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent) r0
            boolean r4 = r1.A03
            r3 = 0
            X.C04220Ms.A0B(r0, r3)
            if (r4 == 0) goto L_0x00f9
            X.69U r9 = X.AnonymousClass69U.A04
        L_0x0081:
            boolean r3 = r0 instanceof com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent
            if (r3 == 0) goto L_0x00b0
            java.lang.String r11 = r0.A02()
            java.lang.String r12 = r0.A03()
            com.facebookpay.common.models.CurrencyAmount r8 = r0.A00()
            java.lang.String r13 = r0.A01()
            com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent) r0
            java.util.Date r3 = r0.A05
            java.util.Date r0 = r0.A04
            java.lang.Integer r10 = X.AnonymousClass006.A0N
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentShippingOptionItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentShippingOptionItem
            r7 = r6
            r14 = r3
            r15 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00a5:
            java.lang.String r0 = A00(r1)
            X.AnonymousClass6I2.A00(r6, r0)
            X.AnonymousClass7Kx.A0N(r6, r2)
            goto L_0x006b
        L_0x00b0:
            boolean r3 = r0 instanceof com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent
            if (r3 == 0) goto L_0x00e0
            java.lang.String r13 = r0.A02()
            java.lang.String r14 = r0.A03()
            com.facebookpay.common.models.CurrencyAmount r7 = r0.A00()
            java.lang.String r15 = r0.A01()
            com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent r0 = (com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent) r0
            java.util.Date r4 = r0.A08
            java.util.Date r3 = r0.A07
            com.facebookpay.shippingaddress.model.ShippingAddress r10 = r0.A02
            java.lang.Boolean r11 = r0.A03
            com.facebookpay.common.models.Distance r8 = r0.A01
            boolean r0 = r0.A09
            java.lang.Integer r12 = X.AnonymousClass006.A0N
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentPickupOptionItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentPickupOptionItem
            r17 = r3
            r18 = r0
            r16 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00a5
        L_0x00e0:
            java.lang.String r11 = r0.A02()
            java.lang.String r12 = r0.A03()
            com.facebookpay.common.models.CurrencyAmount r8 = r0.A00()
            java.lang.String r13 = r0.A01()
            java.lang.Integer r10 = X.AnonymousClass006.A0N
            com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L_0x00a5
        L_0x00f9:
            X.69U r9 = X.AnonymousClass69U.A0X
            goto L_0x0081
        L_0x00fc:
            java.lang.Integer r3 = r1.A02
            java.lang.Integer r5 = X.AnonymousClass006.A0C
            r4 = 0
            r0 = 2131826424(0x7f1116f8, float:1.9285732E38)
            if (r3 != r5) goto L_0x0109
            r0 = 2131826440(0x7f111708, float:1.9285764E38)
        L_0x0109:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.69U r0 = X.AnonymousClass69U.A0i
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r6 = new com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            r6.<init>(r0, r3, r5, r4)
            goto L_0x0064
        L_0x0116:
            X.56r r5 = r1.A07
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r2)
        L_0x011c:
            r5.A0H(r0)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58S.A01(X.58S, java.util.List):void");
    }

    public final void ACT(Bundle bundle, ContextThemeWrapper contextThemeWrapper, Fragment fragment, AnonymousClass7Kx r20) {
        Object fulfillmentOptionComponent;
        Fragment fragment2 = fragment;
        Object obj = r20.A01;
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionFulfillmentOptionItem");
        SelectionFulfillmentOptionItem selectionFulfillmentOptionItem = (SelectionFulfillmentOptionItem) obj;
        String id = selectionFulfillmentOptionItem.getId();
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext loggingContext = this.A00;
        if (loggingContext == null) {
            C86124wJ.A19();
            throw null;
        }
        LinkedHashMap A072 = AnonymousClass7Kr.A07(this.A0A);
        C04220Ms.A0B(id, 1);
        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "user_click_shippingoption_atomic"), 2858), loggingContext, new KtLambdaShape1S2200000_I2(loggingContext, A072, "select_existing_shipping_option", id, 1));
        if (!id.equals(A00(this))) {
            C880856r r1 = this.A08;
            if (selectionFulfillmentOptionItem instanceof SelectionFulfillmentShippingOptionItem) {
                String A022 = selectionFulfillmentOptionItem.A02();
                CurrencyAmount A003 = selectionFulfillmentOptionItem.A00();
                String A012 = selectionFulfillmentOptionItem.A01();
                SelectionFulfillmentShippingOptionItem selectionFulfillmentShippingOptionItem = (SelectionFulfillmentShippingOptionItem) selectionFulfillmentOptionItem;
                fulfillmentOptionComponent = new FulfillmentShippingOptionComponent(A003, id, A022, A012, selectionFulfillmentShippingOptionItem.A07, selectionFulfillmentShippingOptionItem.A06);
            } else if (selectionFulfillmentOptionItem instanceof SelectionFulfillmentPickupOptionItem) {
                String A023 = selectionFulfillmentOptionItem.A02();
                CurrencyAmount A004 = selectionFulfillmentOptionItem.A00();
                String A013 = selectionFulfillmentOptionItem.A01();
                SelectionFulfillmentPickupOptionItem selectionFulfillmentPickupOptionItem = (SelectionFulfillmentPickupOptionItem) selectionFulfillmentOptionItem;
                Date date = selectionFulfillmentPickupOptionItem.A0A;
                Date date2 = selectionFulfillmentPickupOptionItem.A09;
                Boolean bool = selectionFulfillmentPickupOptionItem.A05;
                fulfillmentOptionComponent = new FulfillmentPickupOptionComponent(A004, selectionFulfillmentPickupOptionItem.A02, selectionFulfillmentPickupOptionItem.A04, bool, id, A023, A013, date, date2, selectionFulfillmentPickupOptionItem.A0B);
            } else {
                fulfillmentOptionComponent = new FulfillmentOptionComponent(selectionFulfillmentOptionItem.A00(), id, selectionFulfillmentOptionItem.A02(), selectionFulfillmentOptionItem.A01());
            }
            AnonymousClass7Kx.A0I(r1, new C108806iy(AnonymousClass006.A01, fulfillmentOptionComponent, (String) null));
        }
        ((C147048nI) fragment2).Brt();
    }

    public final M5J Abc() {
        return this.A0B;
    }

    public final M5J Cgs() {
        C880856r r1 = this.A07;
        C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.LiveData<com.fbpay.util.resource.FBPayResource<kotlin.collections.List<com.fbpay.util.resource.FBPayResource<com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem>>>>");
        return r1;
    }

    public final /* synthetic */ boolean Cs9() {
        return true;
    }

    public AnonymousClass58S(AnonymousClass587 r6) {
        this.A0A = r6;
        C880856r A032 = C880856r.A03();
        this.A09 = A032;
        this.A02 = AnonymousClass006.A00;
        this.A06 = C880856r.A03();
        C880856r A022 = C880856r.A02();
        this.A08 = A022;
        C880756q A012 = C880756q.A01();
        this.A05 = A012;
        this.A0B = C880856r.A04(C969667k.ALWAYS_SELECT);
        IDxObserverShape211S0100000_2_I2 A0Q = C86114wI.A0Q(this, 84);
        this.A0C = A0Q;
        IDxObserverShape211S0100000_2_I2 A0Q2 = C86114wI.A0Q(this, 85);
        this.A0D = A0Q2;
        A012.A0K(A032, A0Q);
        A012.A0K(A022, A0Q2);
    }
}
