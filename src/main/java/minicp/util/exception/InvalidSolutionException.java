/*
 * mini-cp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License  v3
 * as published by the Free Software Foundation.
 *
 * mini-cp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY.
 * See the GNU Lesser General Public License  for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with mini-cp. If not, see http://www.gnu.org/licenses/lgpl-3.0.en.html
 *
 * Copyright (c)  2018. by Laurent Michel, Pierre Schaus, Pascal Van Hentenryck
 */

package minicp.util.exception;


public class InvalidSolutionException extends RuntimeException {
    private final String msg;
    public InvalidSolutionException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String toString() {
        return msg;
    }

    /**
     * Forbid the JVM to produce a stack trace each time an InvalidSolutionException is thrown.
     *
     * Uncomment if you need stack traces. Be careful to comment it after debugging.
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
