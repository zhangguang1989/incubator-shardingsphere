/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.proxy.backend.common.jdbc.wrapper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * JDBC executor wrapper.
 *
 * @author zhangliang
 */
public interface JDBCExecutorWrapper {
    
    /**
     * Create statement.
     * 
     * @param connection connection
     * @param sql SQL
     * @param isReturnGeneratedKeys is return generated keys
     * @return statement
     * @throws SQLException SQL exception
     */
    Statement createStatement(Connection connection, String sql, boolean isReturnGeneratedKeys) throws SQLException;
    
    /**
     * Execute SQL.
     * 
     * @param statement statement
     * @param sql SQL to be executed
     * @param isReturnGeneratedKeys is return generated keys
     * @return @{code true} is for query, @{code false} is for update
     * @throws SQLException SQL exception
     */
    boolean executeSQL(Statement statement, String sql, boolean isReturnGeneratedKeys) throws SQLException;
}
