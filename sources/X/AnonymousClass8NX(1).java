package X;

import com.instagram.api.schemas.AudioBrowserPlaylistType;

/* renamed from: X.8NX  reason: invalid class name */
public final class AnonymousClass8NX extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NX A00 = new AnonymousClass8NX();

    public AnonymousClass8NX() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AudioBrowserPlaylistType.A01.get(obj);
        if (obj2 == null) {
            return AudioBrowserPlaylistType.UNRECOGNIZED;
        }
        return obj2;
    }
}
