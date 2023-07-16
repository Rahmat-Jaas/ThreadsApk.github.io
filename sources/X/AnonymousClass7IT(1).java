package X;

import java.util.Map;

/* renamed from: X.7IT  reason: invalid class name */
public final class AnonymousClass7IT {
    public final Map A00 = C18220wO.A0y();

    public static C880756q A01(AnonymousClass7j5 r0, Object obj) {
        C880756q A002 = A00(r0.A01, obj);
        C04220Ms.A0C(A002, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.contactinformation.model.FBPayContactInfoComponent>>");
        return A002;
    }

    public static C880756q A02(C128167j4 r0, Object obj) {
        C880756q A002 = A00(r0.A01, obj);
        C04220Ms.A0C(A002, "null cannot be cast to non-null type androidx.lifecycle.MediatorLiveData<com.fbpay.util.resource.FBPayResource<com.facebookpay.paymentmethod.model.PaymentMethodComponentData>>");
        return A002;
    }

    public static void A03(AnonymousClass7IT r1, Object obj, Object obj2) {
        Map map = r1.A00;
        if (obj != null) {
            map.remove(obj2);
        } else if (map.containsKey(obj2)) {
            C880756q A04 = r1.A04(obj2);
            if (AnonymousClass7Kx.A0O((AnonymousClass7Kx) A04.A08())) {
                A04.A0H(AnonymousClass7Kx.A09((Object) null));
            }
        }
    }

    public final C880756q A04(Object obj) {
        Object obj2 = this.A00.get(obj);
        if (obj2 != null) {
            return (C880756q) obj2;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C880756q A05(Object obj) {
        AnonymousClass7Kx A0R;
        C880756q r3 = (C880756q) this.A00.get(obj);
        if (r3 == null || (A0R = C86104wH.A0R(r3)) == null || AnonymousClass7Kx.A0O(A0R) || (AnonymousClass7Kx.A0R(A0R) && A0R.A01 == null)) {
            return null;
        }
        return r3;
    }

    public static /* synthetic */ C880756q A00(AnonymousClass7IT r3, Object obj) {
        AnonymousClass7Kx A01 = AnonymousClass7Kx.A01();
        Map map = r3.A00;
        Object obj2 = map.get(obj);
        C880756q r0 = obj2;
        if (obj2 == null) {
            C880756q A012 = C880756q.A01();
            A012.A0H(A01);
            map.put(obj, A012);
            r0 = A012;
        }
        return (C880756q) r0;
    }
}
