package X;

import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Tm  reason: invalid class name and case insensitive filesystem */
public final class C102016Tm {
    public static final void A00(List list, String str) {
        int intValue;
        C04220Ms.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass7HP r2 = (AnonymousClass7HP) it.next();
            Integer num = r2.A0E;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue == 1) {
                C22 A00 = r2.A00();
                if (A00 != null) {
                    A00.Chf(str);
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else if (intValue == 5) {
                MusicSearchPlaylist musicSearchPlaylist = r2.A0C;
                if (musicSearchPlaylist != null) {
                    for (AnonymousClass7HP r22 : musicSearchPlaylist.B2y()) {
                        if (r22.A0E == AnonymousClass006.A01) {
                            C22 A002 = r22.A00();
                            if (A002 != null) {
                                A002.Chf(str);
                            } else {
                                throw C18180wK.A0a("Required value was null.");
                            }
                        }
                    }
                    continue;
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else if (intValue == 8) {
                MusicSearchArtist musicSearchArtist = r2.A0A;
                if (musicSearchArtist != null) {
                    musicSearchArtist.A00 = str;
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else {
                return;
            }
        }
    }
}
