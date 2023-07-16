package X;

import com.facebook.redex.IDxSequenceShape670S0100000_I2;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21;

/* renamed from: X.83X  reason: invalid class name */
public abstract class AnonymousClass83X<E> implements Collection<E>, C03740Kn {
    public int A08() {
        return ((AnonymousClass8A5) this).A00.A01.groupCount() + 1;
    }

    public boolean contains(Object obj) {
        if (!(this instanceof Collection) || !isEmpty()) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (C04220Ms.A0I(it.next(), obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this instanceof AnonymousClass8A5) {
            return false;
        }
        return C18180wK.A1W(size());
    }

    public Iterator iterator() {
        if (this instanceof AnonymousClass8A5) {
            IDxSequenceShape670S0100000_I2 iDxSequenceShape670S0100000_I2 = new IDxSequenceShape670S0100000_I2(new AnonymousClass8bH(0, size() - 1), 1);
            KtLambdaShape166S0100000_I2_21 ktLambdaShape166S0100000_I2_21 = new KtLambdaShape166S0100000_I2_21(this, 33);
            AnonymousClass0wJ.A1N(iDxSequenceShape670S0100000_I2, ktLambdaShape166S0100000_I2_21);
            return new C1371286f(ktLambdaShape166S0100000_I2_21, iDxSequenceShape670S0100000_I2).iterator();
        }
        AnonymousClass8AJ r1 = (AnonymousClass8AJ) this;
        if (!(r1 instanceof AnonymousClass8AI)) {
            if (r1 instanceof AnonymousClass8AG) {
                return new AnonymousClass8A7((AnonymousClass8AG) r1);
            }
            if (!(r1 instanceof AnonymousClass8AD)) {
                return new AnonymousClass842(r1);
            }
        }
        return r1.listIterator();
    }

    public final String toString() {
        return AnonymousClass00J.A0H(", ", "[", "]", this, new KtLambdaShape166S0100000_I2_21(this, 30), 24);
    }

    public final boolean add(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean addAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final void clear() {
        throw C18220wO.A0v();
    }

    public final boolean containsAll(Collection collection) {
        if (C86144wL.A1Z(collection)) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean remove(Object obj) {
        throw C18220wO.A0v();
    }

    public final boolean removeAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final boolean retainAll(Collection collection) {
        throw C18220wO.A0v();
    }

    public final /* bridge */ int size() {
        return A08();
    }

    public Object[] toArray(Object[] objArr) {
        return C86114wI.A1a(this, objArr);
    }

    public Object[] toArray() {
        return AnonymousClass0N4.A00(this);
    }
}
