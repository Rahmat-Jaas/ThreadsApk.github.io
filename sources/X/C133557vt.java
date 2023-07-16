package X;

/* renamed from: X.7vt  reason: invalid class name and case insensitive filesystem */
public final class C133557vt implements C83604rg {
    public final /* synthetic */ C127867hq A00;
    public final /* synthetic */ C90965fN A01;
    public final /* synthetic */ Object A02;

    public final void onSearchTextChanged(String str) {
        C04220Ms.A0B(str, 0);
        C90965fN r2 = this.A01;
        Object obj = this.A02;
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<com.instagram.common.bloks.component.base.BloksModel>");
        C127867hq.A00((C108796ix) obj, r2, str);
    }

    public C133557vt(C127867hq r1, C90965fN r2, Object obj) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = obj;
    }

    public final void onSearchCleared(String str) {
        C90965fN r2 = this.A01;
        Object obj = this.A02;
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.facebook.rendercore.simplelist.ListLayoutData<com.instagram.common.bloks.component.base.BloksModel>");
        C127867hq.A00((C108796ix) obj, r2, "");
    }
}
