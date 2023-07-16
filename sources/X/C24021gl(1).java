package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.forker.Process;

/* renamed from: X.1gl  reason: invalid class name and case insensitive filesystem */
public final class C24021gl extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C24021gl(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1562320019);
        AnonymousClass39B r1 = (AnonymousClass39B) view.getTag();
        C04220Ms.A0B(r1, 0);
        r1.A01.setText((String) obj);
        C14030oh.A0A(62889538, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-498597925);
        View A002 = C50362ss.A00(LayoutInflater.from(this.A00), viewGroup);
        C14030oh.A0A(1804700960, A03);
        return A002;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
