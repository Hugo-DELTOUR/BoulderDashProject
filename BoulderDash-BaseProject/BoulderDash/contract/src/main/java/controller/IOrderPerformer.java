package controller;

import java.io.IOException;

import common.UserOrder;

public interface IOrderPerformer {
	
	void orderPerform(UserOrder userOrder) throws IOException;
	
}
