package pr3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class ThreadSafeMap<K, V> implements Map<K, V> {

    private final Map<K, V> map = new HashMap<>();
    private final Semaphore semaphore = new Semaphore(1);

    @Override
    public int size() {
        semaphore.acquireUninterruptibly();
        try {
            return map.size();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean isEmpty() {
        semaphore.acquireUninterruptibly();
        try {
            return map.isEmpty();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean containsKey(Object key) {
        semaphore.acquireUninterruptibly();
        try {
            return map.containsKey(key);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public boolean containsValue(Object value) {
        semaphore.acquireUninterruptibly();
        try {
            return map.containsValue(value);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public V get(Object key) {
        semaphore.acquireUninterruptibly();
        try {
            return map.get(key);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public V put(K key, V value) {
        semaphore.acquireUninterruptibly();
        try {
            return map.put(key, value);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public V remove(Object key) {
        semaphore.acquireUninterruptibly();
        try {
            return map.remove(key);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        semaphore.acquireUninterruptibly();
        try {
            map.putAll(m);
        } finally {
            semaphore.release();
        }
    }

    @Override
    public void clear() {
        semaphore.acquireUninterruptibly();
        try {
            map.clear();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Set<K> keySet() {
        semaphore.acquireUninterruptibly();
        try {
            return map.keySet();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Collection<V> values() {
        semaphore.acquireUninterruptibly();
        try {
            return map.values();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        semaphore.acquireUninterruptibly();
        try {
            return map.entrySet();
        } finally {
            semaphore.release();
        }
    }

    @Override
    public String toString() {
        semaphore.acquireUninterruptibly();
        try {
            return map.toString();
        } finally {
            semaphore.release();
        }
    }
}
