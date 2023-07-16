package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.instagram.quickpromotion.model.FilterType;

/* renamed from: X.40W  reason: invalid class name */
public final class AnonymousClass40W implements C81984oq {
    public final ImmutableList A00;

    public final ImmutableMap ABC() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        ImmutableList immutableList = this.A00;
        if (immutableList != null && !immutableList.isEmpty()) {
            StringBuilder A0r = C18200wM.A0r();
            C1366783w it = immutableList.iterator();
            while (it.hasNext()) {
                C57233Ag r1 = (C57233Ag) it.next();
                if (A0r.length() > 0) {
                    A0r.append(", ");
                }
                FilterType filterType = r1.A00.A00;
                C04220Ms.A06(filterType);
                A0r.append(filterType.name());
            }
            builder.put("filterNames", A0r.toString());
        }
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        return build;
    }

    public AnonymousClass40W(ImmutableList immutableList) {
        this.A00 = immutableList;
    }
}
