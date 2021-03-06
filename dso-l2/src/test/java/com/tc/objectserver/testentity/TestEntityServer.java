/*
 *
 *  The contents of this file are subject to the Terracotta Public License Version
 *  2.0 (the "License"); You may not use this file except in compliance with the
 *  License. You may obtain a copy of the License at
 *
 *  http://terracotta.org/legal/terracotta-public-license.
 *
 *  Software distributed under the License is distributed on an "AS IS" basis,
 *  WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 *  the specific language governing rights and limitations under the License.
 *
 *  The Covered Software is Terracotta Core.
 *
 *  The Initial Developer of the Covered Software is
 *  Terracotta, Inc., a Software AG company
 *
 */
package com.tc.objectserver.testentity;

import org.terracotta.entity.ClientDescriptor;
import org.terracotta.entity.EntityMessage;
import org.terracotta.entity.EntityResponse;
import org.terracotta.entity.ActiveServerEntity;
import org.terracotta.entity.EntityUserException;
import org.terracotta.entity.InvokeContext;
import org.terracotta.entity.PassiveSynchronizationChannel;
import org.terracotta.entity.StateDumper;


public class TestEntityServer implements ActiveServerEntity<EntityMessage, EntityResponse> {

  @Override
  public void connected(ClientDescriptor clientDescriptor) {
  }

  @Override
  public void handleReconnect(ClientDescriptor clientDescriptor, byte[] extendedReconnectData) {
    // Do nothing.
  }

  @Override
  public void disconnected(ClientDescriptor clientDescriptor) {
  }

  @Override
  public EntityResponse invokeActive(InvokeContext context,
                                     EntityMessage message) throws EntityUserException {
    return null;
  }

  @Override
  public void createNew() {
  }

  @Override
  public void loadExisting() {
  }

  @Override
  public void destroy() {
  }

  @Override
  public void synchronizeKeyToPassive(PassiveSynchronizationChannel<EntityMessage> syncChannel, int concurrencyKey) {
    // TODO:  Add synchronization support.
    throw new AssertionError("Synchronization not supported for this entity");
  }

  @Override
  public void dumpStateTo(final StateDumper stateDumper) {
    //nothing to dump
  }
}