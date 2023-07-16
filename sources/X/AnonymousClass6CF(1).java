package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6CF  reason: invalid class name */
public final class AnonymousClass6CF extends Exception {
    public final ImmutableList A00;

    public AnonymousClass6CF(String str, List list) {
        super(str);
        this.A00 = ImmutableList.copyOf((Collection) list);
    }
}
