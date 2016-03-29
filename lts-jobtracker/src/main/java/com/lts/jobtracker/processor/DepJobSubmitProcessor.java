package com.lts.jobtracker.processor;

import com.lts.jobtracker.domain.JobTrackerAppContext;
import com.lts.remoting.Channel;
import com.lts.remoting.exception.RemotingCommandException;
import com.lts.remoting.protocol.RemotingCommand;

/**
 * Created by hugui.hg on 3/27/16.
 */
public class DepJobSubmitProcessor extends AbstractRemotingProcessor {

    public DepJobSubmitProcessor(JobTrackerAppContext appContext) {
        super(appContext);
    }

    @Override
    public RemotingCommand processRequest(Channel channel, RemotingCommand request) throws RemotingCommandException {
        return null;
    }
}
