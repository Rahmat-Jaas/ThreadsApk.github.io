package X;

import android.graphics.Matrix;
import android.view.View;
import kotlin.Unit;

/* renamed from: X.8Wj  reason: invalid class name and case insensitive filesystem */
public final class C140428Wj extends C02220Ah implements AnonymousClass0YP {
    public static final C140428Wj A00 = new C140428Wj();

    public C140428Wj() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        Matrix matrix = (Matrix) obj2;
        AnonymousClass0wJ.A1N(view, matrix);
        matrix.set(view.getMatrix());
        return Unit.A00;
    }
}
