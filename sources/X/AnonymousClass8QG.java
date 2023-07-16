package X;

import com.facebook.rsys.videoeffectcommunication.gen.VideoEffectCommunicationApi;
import kotlin.Unit;

/* renamed from: X.8QG  reason: invalid class name */
public final class AnonymousClass8QG extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QG A00 = new AnonymousClass8QG();

    public AnonymousClass8QG() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C91165fi A0Z = C86134wK.A0Z(obj);
        if (A0Z.A03 != null) {
            A0Z.A03 = null;
            VideoEffectCommunicationApi videoEffectCommunicationApi = A0Z.A00;
            if (videoEffectCommunicationApi != null) {
                videoEffectCommunicationApi.multipeerStopListening();
            }
            C125567dW r1 = A0Z.A01;
            if (r1 != null) {
                r1.A01.clear();
                r1.A00.clear();
            }
            A0Z.A01 = null;
            A0Z.A07.A01 = null;
        }
        return Unit.A00;
    }
}
