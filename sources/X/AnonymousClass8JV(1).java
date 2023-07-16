package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationAdditionalEffectInfo;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationSharedEffectInfo;
import kotlin.Unit;

/* renamed from: X.8JV  reason: invalid class name */
public final class AnonymousClass8JV extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ long A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JV(String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        super(1);
        this.A00 = j;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A06 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IRw iRw = (IRw) obj;
        C04220Ms.A0B(iRw, 0);
        C91165fi r0 = iRw.A0O;
        long j = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        String str4 = this.A05;
        String str5 = this.A01;
        boolean z = this.A06;
        VideoEffectCommunicationApi videoEffectCommunicationApi = r0.A00;
        if (videoEffectCommunicationApi != null) {
            videoEffectCommunicationApi.sendGroupEffect(new VideoEffectCommunicationSharedEffectInfo(j, str, str2, str3, str4, str5, false, false, false, 1, (VideoEffectCommunicationAdditionalEffectInfo) null), z);
        }
        return Unit.A00;
    }
}
