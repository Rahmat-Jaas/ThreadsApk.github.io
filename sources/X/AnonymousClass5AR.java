package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5AR  reason: invalid class name */
public final class AnonymousClass5AR extends C113246qz {
    public final /* synthetic */ C22267CRg A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass5AR(C22267CRg cRg, boolean z) {
        this.A00 = cRg;
        this.A01 = z;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A002 = AnonymousClass0wJ.A00(147715722, recyclerView);
        if (i == 0) {
            AnonymousClass0wJ.A0F().postDelayed(new C27065Ed5(recyclerView, this, this.A00, this.A01), 100);
        }
        C14030oh.A0A(-2134152033, A002);
    }
}
