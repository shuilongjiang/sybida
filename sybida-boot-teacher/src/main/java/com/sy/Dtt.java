package com.sy;

import lombok.Setter;
import org.springframework.data.redis.core.DefaultTypedTuple;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.lang.Nullable;

import java.util.Arrays;

@Setter
public class Dtt<V> implements ZSetOperations.TypedTuple<V>{
    @Nullable
    private  Double score;
    @Nullable
    private  V value;

    public Dtt(){

    }

    public Dtt(@Nullable V value, @Nullable Double score) {
        this.score = score;
        this.value = value;
    }

    @Nullable
    @Override
    public Double getScore() {
        return this.score;
    }

    @Override
    @Nullable
    public V getValue() {
        return this.value;
    }

    @Override
    public int hashCode() {

        int result = 1;
        result = 31 * result + (this.score == null ? 0 : this.score.hashCode());
        result = 31 * result + (this.value == null ? 0 : this.value.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (!(obj instanceof DefaultTypedTuple)) {
            return false;
        } else {
            Dtt<?> other = (Dtt)obj;
            if (this.score == null) {
                if (other.score != null) {
                    return false;
                }
            } else if (!this.score.equals(other.score)) {
                return false;
            }

            if (this.value == null) {
                if (other.value != null) {
                    return false;
                }
            } else {
                if (this.value instanceof byte[]) {
                    if (!(other.value instanceof byte[])) {
                        return false;
                    }

                    return Arrays.equals((byte[])((byte[])this.value), (byte[])((byte[])other.value));
                }

                if (!this.value.equals(other.value)) {
                    return false;
                }
            }

            return true;
        }
    }

    public int compareTo(Double o) {
        double thisScore = this.score == null ? 0.0D : this.score;
        double otherScore = o == null ? 0.0D : o;
        return Double.compare(thisScore, otherScore);
    }

    @Override
    public int compareTo(ZSetOperations.TypedTuple<V> o) {
        return o == null ? this.compareTo(0.0D) : this.compareTo(o.getScore());
    }
}
