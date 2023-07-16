package X;

import java.util.Collection;

/* renamed from: X.1QA  reason: invalid class name */
public final class AnonymousClass1QA extends AnonymousClass3GO {
    public final Collection A00;

    public AnonymousClass1QA(Collection collection) {
        if (!collection.isEmpty()) {
            this.A00 = collection;
            return;
        }
        throw C18190wL.A0a("You need to pass at least one path");
    }
}
