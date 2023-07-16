package kotlinx.serialization.json;

import X.AnonymousClass00J;
import X.AnonymousClass0N4;
import X.AnonymousClass0YY;
import X.AnonymousClass8sP;
import X.C03740Kn;
import X.C04220Ms;
import X.C18220wO;
import X.C86114wI;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonArraySerializer.class)
public final class JsonArray extends JsonElement implements List<JsonElement>, C03740Kn {
    public static final Companion Companion = new Companion();
    public final List A00;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return JsonArraySerializer.A01;
        }
    }

    public JsonArray(List list) {
        C04220Ms.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean containsAll(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return this.A00.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public final Iterator iterator() {
        return this.A00.iterator();
    }

    public final ListIterator listIterator() {
        return this.A00.listIterator();
    }

    public final ListIterator listIterator(int i) {
        return this.A00.listIterator(i);
    }

    public final List subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    public final Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        C04220Ms.A0B(obj, 0);
        return this.A00.contains(obj);
    }

    public final boolean equals(Object obj) {
        return C04220Ms.A0I(this.A00, obj);
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        C04220Ms.A0B(obj, 0);
        return this.A00.indexOf(obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        C04220Ms.A0B(obj, 0);
        return this.A00.lastIndexOf(obj);
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final String toString() {
        return AnonymousClass00J.A0H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "[", "]", this.A00, (AnonymousClass0YY) null, 56);
    }

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(int i, Collection collection) {
        throw C18220wO.A0v();
    }

    public final void clear() {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw C18220wO.A0v();
    }

    public final boolean removeAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final void replaceAll(UnaryOperator unaryOperator) {
        throw C18220wO.A0v();
    }

    public final boolean retainAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw C18220wO.A0v();
    }

    public final void sort(Comparator comparator) {
        throw C18220wO.A0v();
    }

    public final Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean remove(Object obj) {
        throw C18220wO.A0v();
    }
}
