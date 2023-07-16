package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.C02220Ah;
import X.C04220Ms;
import X.C10450iM;
import X.C121857Im;
import X.C13760oG;
import X.C147188nY;
import X.C18180wK;
import X.C18190wL;
import X.C22707Cev;
import X.C968466x;
import X.CDG;
import X.CH4;
import X.CKZ;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.R;
import kotlin.Unit;

public class KtLambdaShape6S0500000_I2 extends C02220Ah implements AnonymousClass0YP {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape6S0500000_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(2);
        this.A05 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
        this.A00 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A05 != 0) {
            Bitmap bitmap = (Bitmap) obj3;
            boolean A1Z = AnonymousClass0wJ.A1Z(bitmap, obj4);
            if (obj4.equals(new KtLambdaShape157S0100000_I2_12(((CDG) this.A04).A09.A00(), 41).invoke(this.A03))) {
                Context context = (Context) this.A00;
                Resources resources = context.getResources();
                boolean z = ((C22707Cev) this.A02).A02;
                int i = R.dimen._self_serve_linking_artist_avatar_search_size;
                if (z) {
                    i = R.dimen.clips_editor_stacked_timeline_reorder_mode_thumbnail_width_enlarged;
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(i);
                Resources resources2 = context.getResources();
                int i2 = R.dimen.clips_editor_stacked_timeline_reorder_mode_thumbnail_height;
                if (z) {
                    i2 = R.dimen.clips_editor_stacked_timeline_reorder_mode_thumbnail_height_enlarged;
                }
                int dimensionPixelSize2 = resources2.getDimensionPixelSize(i2);
                CH4 ch4 = (CH4) this.A01;
                CKZ ckz = new CKZ((double[]) null, A1Z ? 1 : 0, dimensionPixelSize, dimensionPixelSize2, 8, false);
                int i3 = ckz.A02;
                int i4 = ckz.A01;
                float width = (float) bitmap.getWidth();
                float height = (float) bitmap.getHeight();
                float f = ((float) i4) / height;
                C13760oG.A00(bitmap);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * f), (int) (height * f), A1Z);
                int abs = Math.abs(createScaledBitmap.getWidth() - i3);
                try {
                    int abs2 = Math.abs(createScaledBitmap.getWidth() - abs);
                    int abs3 = Math.abs(createScaledBitmap.getHeight());
                    C13760oG.A00(createScaledBitmap);
                    Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, abs / 2, 0, abs2, abs3);
                    C04220Ms.A06(createBitmap);
                    bitmap = createBitmap;
                } catch (IllegalArgumentException e) {
                    StringBuilder A0s = C18190wL.A0s("x: ");
                    A0s.append(abs);
                    A0s.append(", Cropped Width: ");
                    A0s.append(createScaledBitmap.getWidth() - abs);
                    A0s.append(", Cropped Height: ");
                    A0s.append(createScaledBitmap.getHeight());
                    C10450iM.A06("ClipsStackedTimelineVideoTrackAdapter", C18180wK.A0i(". Thumbnail size is negative", A0s), e);
                }
                ckz.A00(0, bitmap);
                ch4.A00 = ckz;
                CH4.A00(ckz, ch4);
            }
        } else {
            C147188nY r13 = (C147188nY) obj3;
            if ((AnonymousClass0wJ.A04(obj4) & 11) != 2 || !r13.BCM()) {
                Object obj5 = this.A02;
                Object obj6 = this.A01;
                Object obj7 = this.A04;
                Object obj8 = this.A00;
                KtLambdaShape6S0400000_I2 ktLambdaShape6S0400000_I2 = new KtLambdaShape6S0400000_I2(17, obj8, obj7, obj5, obj6);
                C968466x r15 = C968466x.Following;
                C968466x r16 = (C968466x) this.A03;
                C121857Im.A04(r13, (Modifier) null, r15, r16, ktLambdaShape6S0400000_I2, 48, 8);
                C121857Im.A04(r13, (Modifier) null, C968466x.Pending, r16, new KtLambdaShape6S0400000_I2(18, obj8, obj7, obj5, obj6), 48, 8);
            } else {
                r13.CuJ();
            }
        }
        return Unit.A00;
    }
}
