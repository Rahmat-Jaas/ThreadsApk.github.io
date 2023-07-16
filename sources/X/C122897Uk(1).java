package X;

import androidx.compose.foundation.pager.PagerState;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.7Uk  reason: invalid class name and case insensitive filesystem */
public final class C122897Uk implements C145698kw {
    public final /* synthetic */ AnonymousClass8cU A00;
    public final /* synthetic */ C146718mk A01;
    public final /* synthetic */ PagerState A02;

    public C122897Uk(AnonymousClass8cU r1, C146718mk r2, PagerState pagerState) {
        this.A02 = pagerState;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final float ABV(C147168nV r13, float f) {
        Object obj;
        int A05;
        Object obj2;
        int i;
        double floor;
        PagerState pagerState = this.A02;
        int A06 = pagerState.A06();
        C147368pE r8 = pagerState.A05;
        int A04 = A06 + AnonymousClass0wJ.A04(r8.getValue());
        float A002 = AnonymousClass6DY.A00(this.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f);
        ListIterator A10 = C86144wL.A10(C147158nU.A01(pagerState));
        while (true) {
            if (!A10.hasPrevious()) {
                obj = null;
                break;
            }
            obj = A10.previous();
            if (C115676vj.A00((AnonymousClass8cc) obj, pagerState.A07(), PagerState.A03(pagerState), AnonymousClass74J.A03) <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                break;
            }
        }
        AnonymousClass8cc r4 = (AnonymousClass8cc) obj;
        if (r4 != null) {
            int i2 = (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
            A05 = ((AnonymousClass7VH) r4).A00;
            if (i2 < 0) {
                A05++;
            }
        } else {
            A05 = pagerState.A05();
        }
        List A012 = C147158nU.A01(pagerState);
        int size = A012.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj2 = null;
                break;
            }
            obj2 = A012.get(i3);
            if (((AnonymousClass7VH) ((AnonymousClass8cc) obj2)).A00 == A05) {
                break;
            }
            i3++;
        }
        AnonymousClass8cc r1 = (AnonymousClass8cc) obj2;
        if (r1 != null) {
            i = ((AnonymousClass7VH) r1).A01;
        } else {
            i = 0;
        }
        double d = (double) ((((float) (A05 * A04)) + A002) / ((float) A04));
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            floor = Math.ceil(d);
        } else {
            floor = Math.floor(d);
        }
        int A022 = AnonymousClass8bI.A02((int) ((float) floor), 0, pagerState.A07().BHd());
        pagerState.A06();
        C86144wL.A1M(r8.getValue());
        int abs = Math.abs((AnonymousClass8bI.A02(AnonymousClass8bI.A02(A022, A05 - 1, A05 + 1), 0, pagerState.A07().BHd()) - A05) * A04) - Math.abs(i);
        if (abs < 0) {
            abs = 0;
        }
        float f2 = (float) abs;
        if (abs != 0) {
            return f2 * Math.signum(f);
        }
        return f2;
    }

    public final float ABf(C147168nV r6) {
        List A012 = C147158nU.A01(this.A02);
        if (!C18190wL.A1a(A012)) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        int size = A012.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((AnonymousClass7VH) ((AnonymousClass8cc) A012.get(i2))).A02;
        }
        return ((float) i) / ((float) A012.size());
    }

    public final AnonymousClass86X ABg(C147168nV r10) {
        PagerState pagerState = this.A02;
        List A012 = C147158nU.A01(pagerState);
        int size = A012.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            float A002 = C115676vj.A00((AnonymousClass8cc) A012.get(i), pagerState.A07(), r10, AnonymousClass74J.A03);
            if (A002 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A002 > f) {
                f = A002;
            }
            if (A002 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A002 < f2) {
                f2 = A002;
            }
        }
        return new AnonymousClass86X(f, f2);
    }
}
