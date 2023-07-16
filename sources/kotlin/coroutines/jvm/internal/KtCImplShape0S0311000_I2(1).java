package kotlin.coroutines.jvm.internal;

import X.AnonymousClass67C;
import X.AnonymousClass7C4;
import X.C146958n9;
import X.C147828pz;
import X.C27236EjA;
import X.C27996Ewk;
import X.C310423z;
import X.C83234r0;
import X.C86144wL;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import com.facebook.forker.Process;
import com.instagram.archive.data.ArchiveStoryRepository;
import com.instagram.fanclub.settings.repository.FanClubSettingsRepository;
import com.instagram.mainfeed.network.FlashFeedCache;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository;

public class KtCImplShape0S0311000_I2 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0311000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A05 = i;
        this.A03 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape0S0311000_I2) || ((KtCImplShape0S0311000_I2) obj).A05 != i) {
            return false;
        }
        return true;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A05) {
            case 0:
                this.A03 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return TapGestureDetectorKt.A01((C147828pz) null, (AnonymousClass67C) null, this, false);
            case 1:
                return ((ArchiveStoryRepository) C86144wL.A0m(obj, this)).A02(this, false, false);
            case 2:
                return ((FanClubSettingsRepository) C86144wL.A0m(obj, this)).A01(this, false);
            case 3:
                return ((FlashFeedCache) C86144wL.A0m(obj, this)).A03(this, false);
            case 4:
                return ((IgLiveQuestionSubmissionsRepository) C86144wL.A0m(obj, this)).A00(this, false);
            case 5:
                return ((RemixSettingsRepository) C86144wL.A0m(obj, this)).A00((C310423z) null, (C310423z) null, this, false);
            default:
                this.A03 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return AnonymousClass7C4.A00(this, (C27996Ewk) null, (C83234r0) null, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0311000_I2(int i, C146958n9 r2) {
        super(r2);
        this.A05 = i;
    }
}
