package kotlin.coroutines.jvm.internal;

import X.AnonymousClass360;
import X.C10300i6;
import X.C146958n9;
import X.C27236EjA;
import X.C27952Ew2;
import X.C30936GbS;
import X.C83234r0;
import X.C86114wI;
import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.forker.Process;
import com.facebook.redex.IDxFCollectorShape29S0400000_2_I2;
import com.facebook.redex.IDxFlowShape76S0300000_2_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.instagram.pendingmedia.service.upload.UploadAudioStep;
import com.instagram.reels.bottomsheet.translation.TranslationAttributionSheetFragment;
import com.instagram.save.playlist.PlaylistRepository;
import com.instagram.security.attestation.keystore.worker.KeyAttestationUtils;
import com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationUtils;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import java.util.List;
import java.util.Set;

public class KtCImplShape2S0501000_I2_1 extends C27236EjA {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public final Object invokeSuspend(Object obj) {
        switch (this.A06) {
            case 0:
                return UploadAudioStep.A00((C30936GbS) null, (UploadAudioStep) C86114wI.A0h(obj, this), this);
            case 1:
                return TranslationAttributionSheetFragment.A00((TranslationAttributionSheetFragment) C86114wI.A0h(obj, this), (String) null, (List) null, this);
            case 2:
                return ((PlaylistRepository) C86114wI.A0h(obj, this)).A01((String) null, (List) null, (List) null, this, 0);
            case 3:
                this.A05 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return KeyAttestationUtils.A00((Context) null, (USLEBaseShape0S0000000) null, (C10300i6) null, (AnonymousClass360) null, (String) null, this, (C27952Ew2) null, false);
            case 4:
                this.A05 = obj;
                this.A00 |= Process.WAIT_RESULT_TIMEOUT;
                return PlayIntegrityAttestationUtils.A00((Context) null, (USLEBaseShape0S0000000) null, (C10300i6) null, (String) null, this, (C27952Ew2) null, false);
            case 5:
                return ((IgLiveCobroadcastRepository) C86114wI.A0h(obj, this)).A05((Set) null, (Set) null, this);
            case 6:
                return IgLiveCommentsRepository.A03((IgLiveCommentsRepository) C86114wI.A0h(obj, this), (List) null, this, false);
            case 7:
                return ((IDxFlowShape94S0200000_2_I2) C86114wI.A0h(obj, this)).collect((C83234r0) null, this);
            case 8:
                return ((IDxFlowShape76S0300000_2_I2) C86114wI.A0h(obj, this)).collect((C83234r0) null, this);
            default:
                return ((IDxFCollectorShape29S0400000_2_I2) C86114wI.A0h(obj, this)).emit((Object) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape2S0501000_I2_1(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A05 = obj;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCImplShape2S0501000_I2_1) || ((KtCImplShape2S0501000_I2_1) obj).A06 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape2S0501000_I2_1(int i, C146958n9 r2) {
        super(r2);
        this.A06 = i;
    }
}
