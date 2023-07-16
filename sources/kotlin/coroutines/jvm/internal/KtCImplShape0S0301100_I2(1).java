package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass7C3;
import X.C146958n9;
import X.C27236EjA;
import X.C86144wL;
import X.D1X;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal;
import com.facebook.forker.Process;
import com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;

public class KtCImplShape0S0301100_I2 extends C27236EjA {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                return ((AndroidEdgeEffectOverscrollEffect) C86144wL.A0l(obj, this)).A92(this, (AnonymousClass0YP) null, 0);
            case 1:
                return ((ScrollableKt$scrollableNestedScrollConnection$1) C86144wL.A0l(obj, this)).CBn(this, 0, 0);
            case 2:
                return ((NestedScrollModifierLocal) C86144wL.A0l(obj, this)).CBr(this, 0);
            case 3:
                return ((MiniGalleryCategoriesRepository) C86144wL.A0l(obj, this)).A00((D1X) null, this, 0);
            case 4:
                return ((IgLiveQuestionsRepository) C86144wL.A0l(obj, this)).A05((String) null, this, 0);
            default:
                this.A04 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return AnonymousClass7C3.A01(this, (AnonymousClass0YP) null, 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0301100_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A04 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape0S0301100_I2) || ((KtCImplShape0S0301100_I2) obj).A05 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0301100_I2(C146958n9 r2) {
        super(r2);
        this.A05 = 5;
    }
}
