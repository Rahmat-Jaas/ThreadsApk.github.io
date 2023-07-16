package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import java.util.List;

/* renamed from: X.5w6  reason: invalid class name */
public final class AnonymousClass5w6 extends C1193875c {
    public static final AnonymousClass5w6 A00 = new AnonymousClass5w6();
    public static final List A01 = C06750aI.A17(C98406Fk.A00("postId", C139508Of.A00), C98406Fk.A00("targetMediaId", C139518Og.A00), C98406Fk.A00("isVideoMuted", C139528Oh.A00));

    public AnonymousClass5w6() {
        super("media_viewer/{postId}/{targetMediaId}/{isVideoMuted}", C18170wI.A00(HttpStatus.SC_LOCKED));
    }
}
