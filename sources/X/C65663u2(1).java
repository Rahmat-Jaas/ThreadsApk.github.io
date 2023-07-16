package X;

import android.view.View;
import android.widget.AdapterView;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.3u2  reason: invalid class name and case insensitive filesystem */
public final class C65663u2 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ AnonymousClass34V A00;
    public final /* synthetic */ AnonymousClass3YK A01;
    public final /* synthetic */ C24691jq A02;

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public C65663u2(AnonymousClass34V r1, AnonymousClass3YK r2, C24691jq r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        String str;
        AnonymousClass3YK r4 = this.A01;
        AnonymousClass34U r0 = r4.A03;
        if (r0 == null) {
            C04220Ms.A0E("groupOverrideProvider");
            throw null;
        }
        String A0h = C18200wM.A0h(r0.A00.A00, r4.A09);
        List list = this.A00.A00;
        if (i < list.size()) {
            str = C61163Sd.A00(list, i);
        } else {
            str = null;
        }
        if (!C32572Cj.A00(str, A0h)) {
            r4.A01(str);
            FragmentActivity fragmentActivity = this.A02.A04;
            fragmentActivity.finish();
            C10650ih.A02(fragmentActivity, C62333Yi.A01().A03(fragmentActivity, 0));
        }
    }
}
