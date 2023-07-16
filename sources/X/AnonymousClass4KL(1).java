package X;

import com.instagram.pendingmedia.model.PendingMedia;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.4KL  reason: invalid class name */
public final class AnonymousClass4KL implements C04850Pk {
    public final /* synthetic */ PendingMedia A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ AnonymousClass8s9 A02;

    public AnonymousClass4KL(PendingMedia pendingMedia, String str, AnonymousClass8s9 r3) {
        this.A00 = pendingMedia;
        this.A01 = str;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void ADn(AnonymousClass0PT r5) {
        AnonymousClass4KO r52 = (AnonymousClass4KO) r5;
        if (r52 != null) {
            PendingMedia pendingMedia = this.A00;
            String str = this.A01;
            Integer num = r52.A00;
            Map map = pendingMedia.A44;
            if (!(map == null || map.get(str) == null)) {
                ((C25336Djw) pendingMedia.A44.get(str)).A01 = num;
            }
        }
        this.A02.resumeWith(Unit.A00);
    }
}
