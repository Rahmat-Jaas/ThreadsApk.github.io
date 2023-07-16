package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

/* renamed from: X.4gh  reason: invalid class name and case insensitive filesystem */
public final class C77504gh extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass0YY A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77504gh(ImageUrl imageUrl, UserSession userSession, AnonymousClass0YY r4, float f, int i) {
        super(1);
        this.A04 = r4;
        this.A01 = i;
        this.A00 = f;
        this.A02 = imageUrl;
        this.A03 = userSession;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        C04220Ms.A0B(sparseArray, 0);
        AnonymousClass0YY r6 = this.A04;
        int i = this.A01;
        float f = this.A00;
        ImageUrl imageUrl = this.A02;
        UserSession userSession = this.A03;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int size = sparseArray.size();
        if (size != 0 && size != 1) {
            Bitmap bitmap = (Bitmap) sparseArray.get(0);
            if (size != 2) {
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, ((float) 10) * f, ((float) 29) * f, (Paint) null);
                }
                Bitmap bitmap2 = (Bitmap) sparseArray.get(1);
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, ((float) 25) * f, ((float) 5) * f, (Paint) null);
                }
                Bitmap bitmap3 = (Bitmap) sparseArray.get(2);
                if (bitmap3 != null) {
                    canvas.drawBitmap(bitmap3, ((float) 40) * f, f * ((float) 26), (Paint) null);
                }
            } else {
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, ((float) 7) * f, ((float) 25) * f, (Paint) null);
                }
                Bitmap bitmap4 = (Bitmap) sparseArray.get(1);
                if (bitmap4 != null) {
                    canvas.drawBitmap(bitmap4, ((float) 32) * f, f * ((float) 7), (Paint) null);
                }
            }
        } else if (imageUrl != null) {
            C37030Jj7 A0A = C37744K2e.A01().A0A(imageUrl, "ROLL_CALL_FACEPILE");
            A0A.A02(new C686344v(canvas, userSession, i));
            A0A.A01();
        }
        C04220Ms.A06(createBitmap);
        r6.invoke(createBitmap);
        return Unit.A00;
    }
}
