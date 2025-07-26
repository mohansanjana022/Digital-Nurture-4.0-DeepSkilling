import React from 'react';
import Post from './Post';
class Posts extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            posts: []
        };
    }
    loadPosts(){
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then(response => response.json())
        .then(data =>{
            const postList = data.map(
                post => new Post(post.id,post.title,post.body)
            );
            this.setState({posts: postList });
        })
        .catch(error => {
            console.error("Error loading posts:",error);
        });
    }
    componentDidMount(){
        this.loadPosts();
    }
    render(){
        return(
            <div>
                <h1> Blog Posts </h1>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{ marginBottom: '1em'}}>
                        <h2>{post.title}</h2>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }
    componentDidCatch(error,info){
        alert('An error occured while rendering the component.');
        console.error("Caught error :",error,info);
    }
}

export default Posts;