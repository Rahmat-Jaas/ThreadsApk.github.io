package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.5ih  reason: invalid class name and case insensitive filesystem */
public final class C92555ih extends C89105Bx {
    public final SparseArray A00;
    public final ViewGroup A01;
    public final List A02 = AnonymousClass0wJ.A0v();

    public C92555ih(SparseArray sparseArray, View view) {
        super(view);
        this.A00 = sparseArray;
        this.A01 = (ViewGroup) AnonymousClass0wJ.A0J(view, R.id.container);
    }
}
