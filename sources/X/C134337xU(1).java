package X;

import com.instagram.common.gallery.GalleryItem;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7xU  reason: invalid class name and case insensitive filesystem */
public final class C134337xU implements C33769Hu7 {
    public final /* synthetic */ C86054wC A00;

    public final void Cmv(List list, String str) {
        C04220Ms.A0B(list, 0);
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0w.add(new GalleryItem((Medium) it.next()));
        }
        this.A00.D7w(A0w);
    }

    public final void Cpb(GalleryItem galleryItem, boolean z, boolean z2) {
    }

    public C134337xU(C86054wC r1) {
        this.A00 = r1;
    }

    public final List B9x() {
        return AnonymousClass0ZV.A00;
    }
}
