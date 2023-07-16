package X;

/* renamed from: X.1hM  reason: invalid class name */
public final class AnonymousClass1hM extends C63873iU {
    public final String A00;
    public final C86034wA A01;
    public final AnonymousClass0IB A02;

    public AnonymousClass1hM(AnonymousClass0IB r1, String str, C86034wA r3) {
        AnonymousClass0wJ.A1O(str, r3);
        this.A00 = str;
        this.A01 = r3;
        this.A02 = r1;
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int A03 = C14030oh.A03(1742957161);
        this.A02.CuW("IGFetcherCallback", "Failed to fetch promotions");
        ((C27178EfE) this.A01).A0M(new C568238r((C963064g) null, this.A00));
        C14030oh.A0A(1191539929, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C14030oh.A03(-179569229);
        C963064g r6 = (C963064g) obj;
        int A002 = AnonymousClass0wJ.A00(1130505584, r6);
        ((C27178EfE) this.A01).A0M(new C568238r(r6, this.A00));
        C14030oh.A0A(708738284, A002);
        C14030oh.A0A(-996622988, A03);
    }
}
