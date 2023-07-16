package X;

import com.facebook.memorytimeline.MemoryTimeline;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Fb  reason: invalid class name and case insensitive filesystem */
public final class C03240Fb extends C11940l3 {
    public final Map A00;
    public final AtomicReference A01 = new AtomicReference((Object) null);

    public C03240Fb() {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        hashMap.put(AnonymousClass0Sw.A0R, "java_heap_used");
        hashMap.put(AnonymousClass0Sw.A07, "address_space_used");
        hashMap.put(AnonymousClass0Sw.A09, "bitmap_count");
        hashMap.put(AnonymousClass0Sw.A0A, "bitmap_kb");
        hashMap.put(AnonymousClass0Sw.A10, "window_count");
        hashMap.put(AnonymousClass0Sw.A0F, "fresco_in_use_bitmap_kb");
        hashMap.put(AnonymousClass0Sw.A0z, "video_memory_cache_kb");
        hashMap.put(AnonymousClass0Sw.A0y, "video_buffer_total_kb");
        hashMap.put(AnonymousClass0Sw.A0M, "hermes_allocated_kb");
        hashMap.put(AnonymousClass0Sw.A0N, "hermes_heap_kb");
        hashMap.put(AnonymousClass0Sw.A0O, "hermes_malloc_size_kb");
    }

    /* renamed from: A03 */
    public final ListenableFuture AHJ(AnonymousClass0Sz r4, AnonymousClass0Sz r5, C09350fH r6) {
        if (!(r4 == null || r5 == null)) {
            A00(r6, r4.A00, true);
            A00(r6, r5.A00, false);
        }
        return C30954Gc6.A01((Object) null);
    }

    public final String B51() {
        return "mobile_infra_memory_stats";
    }

    public final int B52() {
        return 52;
    }

    private void A00(C09350fH r8, Collection collection, boolean z) {
        String str;
        if (z) {
            str = "_start";
        } else {
            str = "_end";
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C05300Sq r4 = (C05300Sq) it.next();
            String str2 = (String) this.A00.get(r4.A02);
            if (str2 != null) {
                r8.AvU().A02(AnonymousClass00U.A0L(str2, str), r4.A00);
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        MemoryTimeline memoryTimeline = (MemoryTimeline) this.A01.get();
        if (memoryTimeline == null) {
            return null;
        }
        return memoryTimeline.ADb();
    }

    public final Class BCf() {
        return AnonymousClass0Sz.class;
    }

    public final boolean BTR(C08640dy r3) {
        return C07960cV.A05(AnonymousClass0e5.A00(36313536171017765L));
    }
}
