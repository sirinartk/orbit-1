import { Actions } from "../actions/messages";

const initialState = {
  addressables: {

  },
  messages: {

  }
};

export default (state = initialState, action) => {
  switch (action.type) {
    case Actions.REPORT_MESSAGES: {

      return {
        ...state,
        messages: {
          ...state.messages,
          [action.payload.addressableId]: action.payload.messages
        }
      }
    }
    case Actions.REPORT_ADDRESSABLES: {
      const addressables = action.payload.addressables.reduce((next, a) => {
        next[a.address] = {
          ...a,
          nodeId: action.payload.nodeId
        }
        return next
      }, {})

      return {
        ...state,
        addressables: Object.assign(state.addressables, addressables)
      }
    }

    default:
      return state;
  }
};
