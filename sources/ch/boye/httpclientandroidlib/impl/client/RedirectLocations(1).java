package ch.boye.httpclientandroidlib.impl.client;

import X.AnonymousClass0wJ;
import X.C18200wM;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RedirectLocations {
    public final List all = AnonymousClass0wJ.A0v();
    public final Set unique = C18200wM.A0u();

    public void add(URI uri) {
        this.unique.add(uri);
        this.all.add(uri);
    }

    public boolean contains(URI uri) {
        return this.unique.contains(uri);
    }

    public List getAll() {
        return C18200wM.A0s(this.all);
    }

    public boolean remove(URI uri) {
        boolean remove = this.unique.remove(uri);
        if (remove) {
            Iterator it = this.all.iterator();
            while (it.hasNext()) {
                if (it.next().equals(uri)) {
                    it.remove();
                }
            }
        }
        return remove;
    }
}
